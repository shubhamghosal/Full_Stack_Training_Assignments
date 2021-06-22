var fs = require('fs');
var empid = "1001";
var resignDate = "03-06-2021";

fs.writeFile("resignedEmp.txt", "", function (err) {
    if (err) {
        console.log(err)
    }
});

fs.readFile('emp.txt', function (err, data) {
    if (err) throw err;
    var details = data.toString().split("\n");
    for (i = 0; i < details.length; i++) {
        var line = details[i].split(":");
        var id = line[0];
        if (empid == id) {
            var name = line[1];
            var resignationDetails = line[0] + ":" + name + ":" + resignDate;
            fs.appendFile('resignedEmp.txt', resignationDetails + "\n" , function(e) {
                if (e) console.log("Error appending to resignation details file.");
                console.log("Resignation details added.");
            });
            break;
        }
    }
});