var fs = require("fs");

fs.readFile("customer.json", "utf8", function (err, data) {
    if (err) {
        console.log(err)
    }
    var empObj = JSON.parse(data);
    var len = empObj.customer.length
    for (i = 0; i < len; i++) {
        var name = empObj.customer[i].cusname;
        var phone = empObj.customer[i].ph;
        console.log("Name:"+name +" , Contact:"+phone);
    }
});