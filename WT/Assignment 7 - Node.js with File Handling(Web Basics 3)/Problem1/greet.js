// User defined local module

exports.greet = function () {
    var d = new Date();
    var hh = d.getHours();
    if (hh >= 5 && hh < 12) {
        return "Good Morning to You.";
    }
    else if (hh >= 12 && hh < 17) {
        return "Good Afternoon to You.";
    }
    else {
        return "Good Evening to You.";
    }
}