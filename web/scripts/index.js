$(document).ready(function () {
    refreshHeader();
    function refreshHeader(){
        console.log("refresh")
    if (isLogedIn) {
        $('#loggedIn').show();
        $("#notLoggedIn").hide();
    }
    else {
        $("#notLoggedIn").show();
        $('#loggedIn').hide()
    }}

    $('#forumButton').click(function () {
        begin2();
    })
})
var password;
var username;
function begin2() {
    username = $('#username').val();
    password = $('#password').val();
    console.log(username + "username");
    console.log(password + "password");
    getUsers();
}

function getUsers() {
    $.ajax({
        url: 'http://192.168.250.37:8080/api/users',
        async: true,
        success: successCallback,
        error: errorCallback
    });
    
}
function successCallback(response) {
    var object = response;
    let ok = false;
    console.log(response);
    //console.log(object.username + "---------")
    object.forEach(element => {
        console.log(element.username);
        console.log(password)
        console.log(element.password)
        if (element.username == username && element.password == password) {
            //alert("correct!")
            ok = true;
            isLogedIn = true;
            currentUserId = element.id;
            var modal = document.getElementById('id01');
            modal.style.display = "none";
            //refreshHeader();
            $('#loggedIn').show();
            $("#notLoggedIn").hide();
            
            return null;
        }
    });
    if (!ok) {
        alert("incorrect");
    }

}

function errorCallback(request, status, error) {
    console.log('Deu ruim, Baby!');
    console.log(request);
    console.log(status);
    console.log(error);
}


// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


