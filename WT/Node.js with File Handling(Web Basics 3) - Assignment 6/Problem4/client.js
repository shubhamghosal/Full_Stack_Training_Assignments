var m1 = require('usmodule')

console.log("Area of circle  is "+m1.f_one.calcArea(3))

console.log("Circumference is "+m1.f_one.calcCircumference(3))

console.log("Diameter of circle is "+m1.f_one.calcDiameter(3))

console.log("Area of rectangle is "+m1.f_two.calcArea(4,2))

console.log("Perimeter of rectangle is "+m1.f_two.calcPerimeter(4,2))

if(m1.f_three.isEquilateral(3,3,3)==true) {
    console.log("Is equilateral")
}
else
console.log("Not equilateral")


console.log("Perimeter of Triangle is "+m1.f_three.calcPerimeter(3,3,3))

