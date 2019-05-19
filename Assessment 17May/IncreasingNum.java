import java.util.*;

class IncreasingNum{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        IncreasingNum ob = new IncreasingNum();
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        ob.checkNumber(n);
    }

    boolean Increment(int n)
    {
        String s = Integer.toString(n);
        char ch;
        int f = 0;
        for(int i=0; i<s.length()-1; i++)
        {
            ch = s.charAt(i);
            if(ch>s.charAt(i+1))
            {
                f = 1;
                break;
            }
        }
        if(f==1)
            return false;
        else
            return true;
    }
     

    void checkNumber(int n) {
        if(Increment(n)==true)
            System.out.println("The number " + n + " is an Increasing Number");
        else 
            System.out.println("The number " + n + " is a Decreasing Number");
       
     }
     
    
}