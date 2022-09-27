'use strict';

$(document).ready(function () {
    let ivo = [1,2,3,4,5];
    ivo[5] = 6;

    for (let i = 0; i < ivo.length; i++) {

        $('#test1').append('<span>' + ivo[i] + ' ' + '</span>');

    }

    ivo.forEach(function(number, index) {
        ivo[index] = 667 * number;
    });

    ivo.forEach(element => {
        $('#test2').append('<span>' + element + ' ' + '</span>');
    });

    ivo.map(function(number, index) {
        ivo[index] = number * 333;
    });
    
    ivo.forEach(element2 => {
        $('#test3').append('<span>' + element2 + ' ' + '</span>');
    });
});