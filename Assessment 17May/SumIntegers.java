import java.util.StringTokenizer;// for breaking a string in to tokens
import java.util.Scanner;
 
class SumIntegers {
    public static void main(String args[]) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.println(st);
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
    }
}