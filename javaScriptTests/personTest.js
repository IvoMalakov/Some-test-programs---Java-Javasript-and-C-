'use strict';

class Person{
    constructor(firstName, lastName, age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    getInfo() {
        let info = this.firstName + " " + this.lastName + " is " + this.age + " years old";
        return info;
    }
}


const Ivo = new Person("Ivo", "Malakov", 36);
let ivoInfo = Ivo.getInfo();
console.log(ivoInfo);