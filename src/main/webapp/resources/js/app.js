var App = angular.module('bookstoreApp',['bookstoreApp.controllers','bookstoreApp.services','ngRoute']);
App.config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/login', {
			templateUrl:'login.html'
			
		})
		.when('/admin', {
			templateUrl:'admin.html'
		})
		.otherwise({
			redirectTo:'/'
		});
}]);
