'use strict';

$(document).ready(function () {
  var ivo = [1, 2, 3, 4, 5];
  ivo[5] = 6;

  for (var i = 0; i < ivo.length; i++) {
    $('#test1').append('<span>' + ivo[i] + ' ' + '</span>');
  }

  ivo.forEach(function (number, index) {
    ivo[index] = 667 * number;
  });
  ivo.forEach(function (element) {
    $('#test2').append('<span>' + element + ' ' + '</span>');
  });
  ivo.map(function (number, index) {
    ivo[index] = number * 333;
  });
  ivo.forEach(function (element2) {
    $('#test3').append('<span>' + element2 + ' ' + '</span>');
  });
});