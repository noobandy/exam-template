"use strict";

angular.module("feedbackApp").controller("MessageController",["MessageService", "$scope", function(MessageService, $scope) {

	MessageService.getMessage().then(function(result) {
		$scope.message = result.data;
	});
}]);