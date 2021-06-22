exports.factorial = function (n) {
    if (n == 0) {
        return 1;
    }

    else {
        return n * exports.factorial(n - 1);
    }
}

exports.myprime = function (n) {
    var prime = true;
    if (n == 1) {
        return "Nether Prime nor even"
    }
    else {
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime == false) {
            return false;
        }
        else {
            return true;
        }
    }
}
exports.printable = function (n) {
    for (i = 1; i <= 10; i++) {
        console.log(n + "x" + i + "=" + n * i);
    }
}