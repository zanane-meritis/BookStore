angular.module('viewModule',['ngRoute'])
	.config(['$routeProvider', function($routeProvider) {
		$routeProvider
			.when('/login', {
				templateUrl:'login.html'
			})
			.otherwise({
				redirectTo:'/'
			});
	}]);
