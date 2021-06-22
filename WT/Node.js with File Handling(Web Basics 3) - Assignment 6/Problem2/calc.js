// Local Module

exports.add = function(a,b) {
    return a+b;
}
exports.subtract = function(a,b) {
    if(a>b) {
        return a-b;
    }
    else
    return b-a;
}

exports.multiply = function(a,b) {
    return a*b;
}

exports.divide = function(a,b) {
    return a/b;
}

exports.square = function(a) {
    return a*a;
}

exports.sum = function(a,b,c) {
    return a+b+c;
}