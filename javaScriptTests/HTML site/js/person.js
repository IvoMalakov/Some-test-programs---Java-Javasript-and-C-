'use strict';

$(document).ready(function() {
    //Some exercises with Objects and prototypes in JavaScript

    function person(firstName, lastName, age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    person.prototype.getInfo = function() {
        let info = this.firstName + " " + this.lastName + " is " + this.age + " years old";
        return info;
    }

    const Pesho = new person('Petur', 'Stoianov', 34);
    let peshoFullName = Pesho.getInfo();


    //The result is not right
    $('#person').append('<span>' + peshoFullName + '</span>');
});