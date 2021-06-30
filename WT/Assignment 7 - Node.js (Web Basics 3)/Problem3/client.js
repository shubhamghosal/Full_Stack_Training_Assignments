var op = require("./mymodule.js")

console.log(op.factorial(5));

var pr = op.myprime(1);
if (pr == true) {
    console.log("Is Prime")
}
else if (pr == false) {
    console.log("Not Prime")
}
else
    console.log(pr);

op.printable(7)
