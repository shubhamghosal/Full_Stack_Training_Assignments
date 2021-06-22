exports.isEquilateral = function(side1, side2, side3) {
    if(side1 == side2 && side2==side3) {
        return true;
    }
    else
    return false;

}

exports.calcPerimeter = function(side1, side2, side3) {
    return side1+side2+side3;

}