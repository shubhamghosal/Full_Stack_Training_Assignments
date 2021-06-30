// User defined local module

exports.greet = function () {
    var d = new Date();
    var hh = d.getHours();
    if (hh >= 5 && hh < 12) {
        return "Time is " + hh + " clock. Good Morning to You.";
    }
    if (hh >= 12 && hh < 17) {
        return "Time is " + hh + " clock. Good Afternoon to You.";
    }
    if (hh >= 17 && hh < 21) {
        return "Time is " + hh + " clock. Good Evening to You.";
    }
    else {
        return "Time is " + hh + " clock. Good Night to You.";
    }
}