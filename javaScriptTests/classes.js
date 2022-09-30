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

        let Square = function(a, b) {
            Shape.apply(this, a, b);
            this.b = b;
        };

        Square.prototype = Object.create(Shape.prototype);
        Square.prototype.constructor = Square;
        Square.prototype.calculateArea = function() {
            return this.a * this.b;
        }

        let testSquare = new Square(5, 4);
        let testSquareArea = testSquare.calculateArea();
        
        console.log(testSquareArea);
