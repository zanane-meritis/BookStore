package fr.meritis.bookstore.security;

import java.io.Serializable;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

import fr.meritis.bookstore.model.User;

public class BooksStorePermissionEvaluator implements PermissionEvaluator{
	
	private DataSource datasource;
	

	public boolean hasPermission(Authentication auth, Object targetDomainObject, Object permission) {
		JdbcTemplate template = new JdbcTemplate(datasource);
		
		Object[] args = {((User)auth.getPrincipal()).getUsername(),targetDomainObject.getClass().getName(), permission.toString()};
		
		int count = template.queryForObject("select count(*) from permission p where p.username=? and p.target=? and p.permission=?", args, Integer.class);
	
		return (count==1);
	}

	public boolean hasPermission(Authentication arg0, Serializable arg1, String arg2, Object arg3) {
		return false;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

}
