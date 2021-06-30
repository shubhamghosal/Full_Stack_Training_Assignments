var fs = require("fs");

fs.readFile("bookdetails.json", "utf8", function (err, data) {
    if (err) {
        console.log(err)
    }
    var bookObj = JSON.parse(data);
    
    var len = bookObj.book.length
    fs.writeFile("book.txt", "", function (err) {
        if (err) {
            console.log(err)
        }
    });
    for (i = 0; i < len; i++) {
        var id = bookObj.book[i].bookid;
        var bname = bookObj.book[i].name;
        var auth = bookObj.book[i].author;
        var pr = bookObj.book[i].price;
        var det = [id, bname, auth, pr];
        var bookdet = det.join(':')
        fs.appendFile("book.txt", bookdet + "\n", function (err) {
            if (err) {
                console.log(err)
            }
        });
    }
    console.log("File Written Succesfully")
});