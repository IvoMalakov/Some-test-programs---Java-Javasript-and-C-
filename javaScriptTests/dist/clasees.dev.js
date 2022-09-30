"use strict";

function _typeof(obj) { if (typeof Symbol === "function" && typeof Symbol.iterator === "symbol") { _typeof = function _typeof(obj) { return typeof obj; }; } else { _typeof = function _typeof(obj) { return obj && typeof Symbol === "function" && obj.constructor === Symbol && obj !== Symbol.prototype ? "symbol" : typeof obj; }; } return _typeof(obj); }

function _possibleConstructorReturn(self, call) { if (call && (_typeof(call) === "object" || typeof call === "function")) { return call; } return _assertThisInitialized(self); }

function _assertThisInitialized(self) { if (self === void 0) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return self; }

function _getPrototypeOf(o) { _getPrototypeOf = Object.setPrototypeOf ? Object.getPrototypeOf : function _getPrototypeOf(o) { return o.__proto__ || Object.getPrototypeOf(o); }; return _getPrototypeOf(o); }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function"); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, writable: true, configurable: true } }); if (superClass) _setPrototypeOf(subClass, superClass); }

function _setPrototypeOf(o, p) { _setPrototypeOf = Object.setPrototypeOf || function _setPrototypeOf(o, p) { o.__proto__ = p; return o; }; return _setPrototypeOf(o, p); }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

var Shape =
/*#__PURE__*/
function () {
  function Shape(a) {
    _classCallCheck(this, Shape);

    if (this.constructor === Shape) {
      throw new Error("You can not create an object on Shape");
    }

    this.a = a;
  }

  _createClass(Shape, [{
    key: "calculateArea",
    value: function calculateArea() {
      throw new Error("Abstrac Method has no implementation");
    }
  }]);

  return Shape;
}();

var Square =
/*#__PURE__*/
function (_Shape) {
  _inherits(Square, _Shape);

  function Square(a, b) {
    var _this;

    _classCallCheck(this, Square);

    _this = _possibleConstructorReturn(this, _getPrototypeOf(Square).call(this, a));
    _this.b = b;
    return _this;
  }

  _createClass(Square, [{
    key: "calculateArea",
    value: function calculateArea() {
      return this.a * this.b;
    }
  }]);

  return Square;
}(Shape);

var testSquare = new Square(5, 4);
var testSquareArea = testSquare.calculateArea();
console.log(testSquareArea);