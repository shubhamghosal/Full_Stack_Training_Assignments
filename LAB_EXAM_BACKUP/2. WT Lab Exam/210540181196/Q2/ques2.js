var fs = require("fs");

fs.readFile("numbers.txt",function(err,data){
    if(err)
        console.log(err);
    else
    {
        var arr = data.toString().split("\n");
        var sumOfOri=0;
        var sum=0;
        var sq;
        arr.forEach(function(i){
            sq = i*i;
            console.log(sq);
            sum += sq;
        })
        console.log("Sum = "+sum);
        arr.forEach(function(i){
            sumOfOri += parseInt(i);
        })
        console.log("Average = "+(sumOfOri/5));
    }
})
