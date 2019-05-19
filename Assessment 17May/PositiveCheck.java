
import java.util.*;
import java.util.Scanner;

class PositiveCheck { 
    static boolean Check(String str) { 
        int len = str.length(); 
  
        for (int i = 1; i < len; i++) {   
            if (str.charAt(i) < str.charAt(i - 1)) { 
                return false; 
            } 
        } 
  
        return true; 
    } 
  
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Any String for checking: ");
        String str = sc.nextLine();
        if (Check(str)) { 
            System.out.println("Input is positive"); 
        } else { 
            System.out.println("Input is not positive"); 
        } 
    } 
} 