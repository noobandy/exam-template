"use strict";

angular.module("feedbackApp").service("MessageService",["$http", function($http) {
	this.getMessage = function() {
		return $http.get("http://localhost/api/message");
	}
}]);