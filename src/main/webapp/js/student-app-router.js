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
	}).otherwise({
		redirectTo : 'index.html'
	});
} ]);

