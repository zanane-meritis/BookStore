var app = angular.module('bookstoreApp',['ngRoute']);
app.config(function($routeProvider,$httpProvider) {
	$routeProvider
		.when('/login', {
			templateUrl:'login.html',
		})
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
	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
});
