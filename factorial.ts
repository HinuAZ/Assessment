import * as readline from 'readline';
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  valFromRuntime.question('Enter any number', (answer)=>
  {
    var n= parseInt(answer);
    var f=1;
    for (let i = 1; i <= n; i++) 
    {
        f=f*i;
    }
    console.log(`Factorial of ${n} is ${f}`);
    valFromRuntime.close();

  });