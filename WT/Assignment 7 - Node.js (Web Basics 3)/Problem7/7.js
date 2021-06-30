var fs = require("fs")

var totalSal = 0;
fs.readFile("emp.txt", "utf8", function (err, data) {
    if (err) {
        return console.log(err);
    }
    var rows = data.split("\n");
    for (i = 0; i < rows.length; i++) {
        if (i >= 0) {
            var empData = rows[i].split(":");
            totalSal += parseInt(empData[3]);
        }
    }

    console.log("Sum of salary is " + totalSal);
    console.log("File read Successfully");

});