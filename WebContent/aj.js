var app = angular.module("app", []);
app.controller("HelloController", function($scope) {
  $scope.message = "Hello, AngularJS Testssdsdsdf";	
});


app.directive("w3TestDirective", function() {
	  return {
	    template : "I was made in a directive constructor!"
	  };
	});


app.controller("myCtrl", function($scope) {
	  $scope.firstName = "John";
	  $scope.lastName= "Doe";
	});

var app = angular.module("myApp", []);

