var http = require("http");
var fs = require("fs")

fs.readFile("welcome.html", function (err, data) {
    var ser = http.createServer(function (req, res) {
        if (err) {
            res.writeHead(404, { 'content-type': 'text/html' })
            res.write(err)
            res.end()
        }
        res.writeHead(200, { 'context-type': 'text/html' })
        res.write(data)
        res.end()
    });
    ser.listen(3000, "localhost");
});