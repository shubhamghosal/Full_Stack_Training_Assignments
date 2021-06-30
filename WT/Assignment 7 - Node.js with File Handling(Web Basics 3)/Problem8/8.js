var fs = require("fs");

var empData = [
    {
        "empid": 1001,
        "empname": "Harry",
        "salary": 23000
    },
    {
        "empid": 1002,
        "empname": "Ravi",
        "salary": 24000
    },
    {
        "empid": 1003,
        "empname": "Arjun",
        "salary": 27000
    },
    {
        "empid": 1004,
        "empname": "Shyam",
        "salary": 32000
    }
]

fs.writeFile("book.txt", "",function(err){
    if (err) {
        console.log(err)
    }
});

for (i = 0; i < empData.length; i++) {
    var emp = [empData[i].empid, empData[i].empname, empData[i].salary];
    var data = emp.join(':')
    fs.appendFile("emp.txt", data + "\n", function (err) {
        if (err) {
            console.log(err);
        }
    });
}
console.log("File Written Succesfully")
