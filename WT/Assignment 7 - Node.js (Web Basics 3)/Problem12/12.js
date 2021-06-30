var fs = require("fs");

fs.readFile("text.txt", "utf8", function (err, data) {
    if (err) {
        console.log(err)
    }
    var rows = data.split("\n");
    for (i = 0; i < rows.length; i++) {
        var sampleData = (i + 1) + ") " + rows[i];
        console.log(sampleData);
    }
});