$(document).ready(function() {

    function successCallback(response) {
        console.log(response);
        alert("ok");
        jsObj = response;

        jsObj.forEach(element => {
                $('<tr>' + '<td>' + element.id + '</td>' +
                '<td>' + element.firstName + '</td>' +
                '<td>' + element.lastName + '</td>' +
                '<td>' + element.email + '</td>' +
                '<td>' + element.phone + '</td>' +
                '<td>' + '<input type="button" value="Edit" id="' + element.id + '" class="edit"/>' + '</td>' +
                '<td>' + '<input type="button" value="Delete" id="' + element.id + '" class="delete"/>' + '</td>' +
                '<td>' + '<input type="button" value="Update" id="' + element.id + '" class="update"/>' + '</td>' +
                '</tr>').appendTo('.users-table');
        });
    }

    function errorCallback(request, status, error) {
        console.log(request);
        console.log(status);
        console.log(error);
    }

    $("#sub").click(function(event) {
        $.ajax({
            url: 'http://192.168.250.37:8080/api/users',
            type: 'POST',
            dataType: 'json',
            data: JSON.stringify({
                username: $("#usernameForm").val(),
                password: $("#passForm").val(),
                name: $("#nameForm").val(),
                email: $("#emailForm").val(),
                rating: $("#ratingForm").val()
            }),
            async: true,
            contentType: 'application/json',
            success: successCallback,
            error: errorCallback
        });
    });
    
    
    
});