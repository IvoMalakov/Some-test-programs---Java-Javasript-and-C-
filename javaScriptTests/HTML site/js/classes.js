'use strict';

$(document).ready(function() {
    //Some exercises with classes and extends

    let Shape = function(a) {
        this.a = a;

        if (this.constructor === Shape) {
            throw new Error("You can not create an object on Shape");
        }
    }

    //@abstract

    Shape.prototype.calculateArea = function() {
        throw new Error("Abstrac Method has no implementation");
    }

    // Shape is an abstract class - You can not make an object of type Shape. 
    //Test is working - it trows an error:
        // const shape = new Shape(5);
        // let shapeArea = shape.calculateArea();

        // $("#class").append('<span>' + shapeArea + '</span>');

        let Square = function() {
            Shape.apply(this, arguments);
            this.b = arguments[1];
        };

        Square.prototype = Object.create(Shape.prototype);
        Square.prototype.constructor = Square;
        Square.prototype.calculateArea = function() {
            return this.a * this.b;
        }

        let testSquare = new Square(5, 4);
        let testSquareArea = testSquare.calculateArea();

        $('#class').append('<span>Square area is: <span class ="red">' 
        + testSquareArea + '</span></span>');

});