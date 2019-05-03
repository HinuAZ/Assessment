// Write a program in typescript which prints the sum of individual digits of a number entered at runtime
"use strict";
exports.__esModule = true;
var readline = require("readline");
var valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
valFromRuntime.question('enter a number: ', function (value) {
    //var value = 2568,
    var sum = 0;
    while (value) {
        sum += value % 10;
        value = Math.floor(value / 10);
    }
    console.log(sum);
    valFromRuntime.close();
});
