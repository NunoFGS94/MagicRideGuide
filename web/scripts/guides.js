$(document).ready(function () {
    begin();
})

function begin() {
    $.ajax({
        url: 'http://192.168.250.37:8080/api/guides',
        async: true,
        success: successCallback,
        error: errorCallback
    })

    function successCallback(response) {
        var object = response;
        populateTable(object);
    }

    function errorCallback(request, status, error) {
        console.log('Error getting guide list.');
        console.log(request);
        console.log(status);
        console.log(error);
    }
}

function populateTable(array) {
    var userstable = $('#guide-table');


    array.forEach(function (element) {

        var row = '<tr class="populated"> <td class="align-middle"><a href="guide-view/' + element.id + '" target="content"><img src= "resources/maf.png" height="80" width="80"></a></td>' +
            '<td id="two" class="align-middle">' + element.name + '</td>' +
            '<td id="three" class="align-middle"><span class="yellow">&#9733;</span> ' + element.rating + '</td>' +
            '<td id="four" class="align-middle"><button id="tag1" class="interest">' + element.tag1 + '</button></td>' +
            '<td id="five" class="align-middle"><button id="tag1" class="interest">' + element.tag2 + '</button></td>' +
            '<td id="six" class="align-middle"><button id="tag1" class="interest">' + element.tag3 + '</button></td>' +
            '<td id="seven" class="align-middle"><button id="tag1" class="interest">' + element.tag4 + '</button></td>' +
            '<td id="eight" class="align-middle"><button id="tag1" class="interest">' + element.tag5 + '</button></td></tr><br>'

        $(row).appendTo(userstable);
    })
}

function hideList() {
    var div = document.getElementById('content');

    if (div.style.display == 'none') {
        div.style.display = 'block';
    }
}