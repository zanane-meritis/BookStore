var app = angular.module('bookstoreApp');
//var auth = app.factory('auth');
app.controller('LoginController',['$scope', '$routeParams', '$http','$location', 'auth',function($scope, $routeParams, $http, $location,auth){

	$scope.credentials = {};
	$scope.login = function(){
		auth.authenticate($scope.credentials,function(authenticated) {
			if (authenticated) {
				console.log("Login succeeded")
				$scope.error = false;
			} else {
				console.log("Login failed")
				$scope.error = true;
			}
		})
	};
}]);