var bookstoreController=angular.module('bookstoreApp.controllers',[]);

bookstoreController.controller('indexController',function($scope,$location){
	$scope.isActive = function(route){
		return route === $location.path();
	}
});