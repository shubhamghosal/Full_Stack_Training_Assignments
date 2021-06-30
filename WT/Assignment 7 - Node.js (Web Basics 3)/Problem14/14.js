var http = require("http");
var fs = require("fs");
var gr = require('./greet.js')

var ser = http.createServer(function (req, res) {
    if (req.method == 'GET' && req.url == '/') {
        fs.readFile('./welcome.html', function (err, data) {
            if (err) {
                res.writeHead(404, { 'Content-Type': 'text/html' });
                res.end("404 Not Found");
            }
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.write(data);
            res.end();
        });
    }
    else if (req.method == 'GET' && req.url.substring(0, 8) == '/greet') {
        res.writeHead(200, { 'content-type': 'text/html' })
        var str = "<h3>" + gr.greet() + "</h3>"
        res.write(str);
        res.end()
    }
    else {
        var path = req.url.substr(1)
        if (req.method = "GET") {
            fs.readFile("./" + path, (err, data) => {
                if (err) {
                    res.writeHead(404, { 'content-type': 'text/html' })
                    res.end()
                } else {
                    res.writeHead(200, { 'content-type': 'text/html' })
                    res.write(data);
                    res.end()
                }
            });
        }
    }
});
ser.listen(1337, '127.0.0.1');
console.log("Server running at http://127.0.0.1:1337")