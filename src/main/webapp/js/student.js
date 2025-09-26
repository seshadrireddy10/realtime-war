/**
 * 
 */

var studentApp = angular.module('studentApp', ['ngRoute']);

studentApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'view/home.html',
		controller : 'MainCtrl'
	}).when('/register', {
		templateUrl : 'view/student-register.tpl.html',
		controller : 'MainCtrl'
	}).when('/login', {
		templateUrl : 'view/login.html',
		controller : 'MainCtrl'
	}).when('/enquiry', {
		templateUrl : 'view/student-enquiry.html',
		controller : 'MainCtrl'
	}).when('/students', {
		templateUrl : 'view/students-list.html',
		controller : 'MainCtrl'
	}).when('/studentFeeDetails', {
		templateUrl : 'view/student-fee-details.html',
		controller : 'MainCtrl'
	}).when('/courses', {
		templateUrl : 'view/student-courses.html',
		controller : 'MainCtrl'
	}).otherwise({
		redirectTo : 'index.html'
	});
} ]);

studentApp.controller('MainCtrl', function($rootScope , $scope, $http) {
	
	$scope.saveStudents = function(){
		var studentJson = {
				"firstName":$scope.saveStudents.firstName,
				"lastName":$scope.saveStudents.lastName,
				"email":$scope.saveStudents.email,
				"courses":$scope.saveStudents.courses,
				"yearOfPass":$scope.saveStudents.yesrOfPass,
				"password":$scope.saveStudents.password,
				"profilePic":$scope.saveStudents.profilePic,
				"mobile":$scope.saveStudents.mobile
		};
		$http({
			url : Constants.URLS.SAVE_STUDENT_DETAILS,
			method : 'POST',
			data:studentJson,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(data, status, headers, config) {
			console.log("success:", data);
		}).error(function(data, status, headers, config) {
			console.log("error:", data);
		});
	};
	
	$scope.getAllCourses = function(){
		 $scope.courses = [];
		$http({
			url : Constants.URLS.GET_ALL_COURSES,
			method : 'GET',
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(data, status, headers, config) {
			$scope.courses=data;
			console.log("success:", data);
		}).error(function(data, status, headers, config) {
			console.log("error:", data);
		});
	};
//	$scope.getAllCourses();
	
	$scope.getAllStudents = function(){
		 $scope.students = [];
		$http({
			url : Constants.URLS.GET_ALL_STUDENTS,
			method : 'GET',
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(data, status, headers, config) {
			$scope.students=data;
			console.log("success:", data);
		}).error(function(data, status, headers, config) {
			console.log("error:", data);
		});
	};
	$scope.getAllStudents();
	
	$scope.studentFeeDetails = function(studentId){
		 $scope.studentFeeDetails = [];
		$http({
			url : Constants.URLS.GET_STUDENTS_FEE_DETAILS+studentId,
			method : 'GET',
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(data, status, headers, config) {
			$scope.studentFeeDetails=data;
			console.log("success:", data);
		}).error(function(data, status, headers, config) {
			console.log("error:", data);
		});
	};
	
	$scope.studentCourses = function(studentId){
		 $scope.studCourses = [];
		$http({
			url : Constants.URLS.GET_STUDENT_COURSE+studentId,
			method : 'GET',
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(data, status, headers, config) {
			$scope.studCourses=data;
			console.log("success:", data);
		}).error(function(data, status, headers, config) {
			console.log("error:", data);
		});
	};
//	$scope.getAllStudents();
	
	
});