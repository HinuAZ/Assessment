
//- Write a program which prints the upper diagonal of a matrices array

let mat: number[][]=[[1,2,3],[4,5,6],[7,8,9]];
var arr2:number[][];
console.log(mat);
let len=mat.length;
for (let i = 0; i < 3; i++) 
{
    for (let j = 0; j <len; j++)
    {
    console.log(mat[i][j]);
    }
    len--;
    
}