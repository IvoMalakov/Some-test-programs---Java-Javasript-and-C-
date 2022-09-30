class Shape {
        constructor(a) {
        if (this.constructor === Shape) {
            throw new Error("You can not create an object on Shape");
        }
        
        this.a = a;
    }
    
    calculateArea() {
        throw new Error("Abstrac Method has no implementation");
    }
 }
 
class Square extends Shape {
    constructor(a, b) {
        super(a);
        this.b = b;
    }
    
    calculateArea() {
        return this.a * this.b;
    }
}

    let testSquare = new Square(5, 4);
    let testSquareArea = testSquare.calculateArea();
    console.log(testSquareArea);    
