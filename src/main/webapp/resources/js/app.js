var app = angular.module('bookstoreApp',['ngRoute','IndexController','LoginController','LoginService']);
app.config(function($routeProvider,$httpProvider) {
	$routeProvider
		.when('/features', {
			templateUrl:'features.html',
		})
		.when('/contact', {
			templateUrl:'contact.html',
		})
		.when('/admin', {
			templateUrl:'admin.html'
		})
		.otherwise('/');
	//$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
}).run(function(LoginService){
	LoginService.init('/', 'login', 'logout');
});
