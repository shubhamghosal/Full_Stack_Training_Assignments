var fs = require("fs")

var arr = ["Ravi", "Arjun", "John", "Anil", "Sumit"];

var str = arr.join('|');

fs.writeFile("names.txt", str, function (err) {
    if (err) {
        console.log(err);
    }
    else
        console.log("Files Written Succesfully")
});