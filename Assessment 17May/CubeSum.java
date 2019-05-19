import java.util.*;
import java.io.*;

class CubeSum {
public static void main(String args[]){
    int input=0;
    int num1,num2,num3;
    System.out.println("Enter a Number :");
    Scanner sc = new Scanner(System.in);
    input= Integer.parseInt(sc.nextLine());

    
    int number = input; 
    int counter = 0; 
    int total=0;

    while(number>0){
        int t= number%10;
        int sum=t*t*t;
        counter = counter+1;
        number = number/10;
        total=total+sum;

    }
    
 System.out.println("sum :" +total);
}
}