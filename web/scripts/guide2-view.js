$(document).ready(function () {
    begin();
})

function begin() {
    console.log(globalId);
    $.ajax({
        url: 'http://192.168.250.37:8080/api/guides/'+ 21,
        async: true,
        success: successCallback,
        error: errorCallback
    })

    function successCallback(response) {
        var object = response;
        console.log(object);
        populateView(object);
    }

    function populateView(element) {

        $('#portrait').attr('src', 'resources/perfil' + element.id + '.jpg');
        document.getElementById('guide-name').innerHTML = element.name;
        document.getElementById('rating').innerHTML = element.rating;
        document.getElementById('city').innerHTML = element.local;
        document.getElementById('languages').innerHTML = element.language1+ " | " +element.language2;
        document.getElementById('description').innerHTML = element.description;
        document.getElementById('map').innerHTML = element.mapurl;
        document.getElementById('tag1').innerHTML = element.tag1;
        document.getElementById('tag2').innerHTML = element.tag2;
        document.getElementById('tag3').innerHTML = element.tag3;
        document.getElementById('tag4').innerHTML = element.tag4;
        document.getElementById('tag5').innerHTML = element.tag5; 
    } 
    function errorCallback() {
        console.log('Deu ruim, Babye2!')
    }
}
