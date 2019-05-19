


import java.util.regex.Pattern;  
import java.util.regex.Matcher;   

class CheckUserName
{
    public static void main(String[] args) {
        
        String input = new String();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a username with 'XXXXXXXX_job' format ");
        input = sc.nextLine();
        int len = input.length();
        if(len < 15)
            System.out.println("Long UserName!! eNTER NOT MORE THAN 10");
        else
        {
            String pattern = "[a-z]{8}_[job]+";
            if(input.matches(pattern))
                System.out.println("Perfect User Name");
            else
                System.out.println("Incorrect UserName");
        }

    }
}