var app = angular.module('hello', []);

app.controller("AppController", function ($scope, $http) {
    $scope.websites = [];

    $http.get('api/stackoverflow').success(function (data) {
        $scope.websites = data;
    })
});