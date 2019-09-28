var app = angular.module("UserManagement", []);
 
// Controller Part
app.controller("UserController", function($scope, $http) {
 
 
    $scope.users = [];
    $scope.userForm = {
    		id: "",
    		firstName: "",
    		lastName: "",
    		email: ""
    };
 
    // Now load the data from server
    _refreshUserData();
 
    
    $scope.submitUser = function() {
 
        var method = "";
        var url = "";
 
        
            method = "POST";
            url = '/createUser';
        
 
        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.userForm),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };
 
    $scope.createUser = function() {
        _clearFormData();
    }
 
    
    $scope.deleteUser = function(user) {
        $http({
            method: 'DELETE',
            url: '/delete/' + user.id
        }).then(_success, _error);
    };
 
    // In case of edit
    $scope.editUser = function(user) {
        $scope.userForm.id = user.id;
        $scope.userForm.firstName = user.firstName;
        $scope.userForm.lastName = user.lastName;
        $scope.userForm.email = user.email;
    };
 
    
    function _refreshUserData() {
        $http({
            method: 'GET',
            url: '/getAllUsers'
        }).then(
            function(res) { // success
                $scope.users = res.data;
            },
            function(res) { // error
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }
 
    function _success(res) {
    	_refreshUserData();
        _clearFormData();
    }
 
    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }
 
    // Clear the form
    function _clearFormData() {
        $scope.userForm.id = -1;
        $scope.userForm.firstName = "";
        $scope.userForm.lastName = ""
        	$scope.userForm.email = ""
    };
});