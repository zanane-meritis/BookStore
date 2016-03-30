
var app = angular.module('bookstoreApp');

var auth = app.factory('auth',function($http, $location){
	return {
			authenticated : false,

			loginPath : '/login',
			logoutPath : '/logout',
			homePath : '/',

			authenticate : function(credentials, callback) {

				var data = "username="+credentials.username+"&password="+credentials.password+"&submit=Login";

				$http.post('login', data, {
					headers: {
						'Content-Type': 'application/x-www-form-urlencoded',
					}
				}).
				success(function(data) {
					if (data.authenticated) {
						auth.authenticated = true;
					} else {
						auth.authenticated = false;
					}
					$location.path(auth.homePath);
					callback && callback(auth.authenticated);
				}).
				error(function(data){
					auth.authenticated = false;
					callback && callback(false);
					console.warn('This is a wrong username or/and a wrong password. Try again');
				});
			},

			clear : function() { 
				auth.homePath = homePath;
				auth.loginPath = loginPath;
				auth.logoutPath = logoutPath;
			},

			init : function(homePath, loginPath, logoutPath) { 
				auth.authenticated = false;
				$location.path(auth.loginPath);
				$http.post(auth.logoutPath, {});
			}
	};
});

app.controller('IndexController',function($scope,$location){
	$scope.isActive = function(route){
		return route === $location.path();
	}
	$scope.authenticated = function() {
		return auth.authenticated;
	}
});

