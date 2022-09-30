'use strict';

$(document).ready(function () {
  //Some exercises with Objects and prototypes in JavaScript
  function person(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  person.prototype.getInfo = function () {
    var info = this.firstName + " " + this.lastName + " is " + this.age + " years old";
    return info;
  };

  var Pesho = new person('Petur', 'Stoianov', 34);
  var peshoFullName = Pesho.getInfo();
  $('#person').append('<span>' + peshoFullName + '</span>');
});