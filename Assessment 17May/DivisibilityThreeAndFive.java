import java.util.Scanner;

class DivisibilityThreeAndFive
{
    public static void main(String[] args) {
        
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The limit");
        num = sc.nextInt();

       DivisibilityThreeAndFive  obj = new DivisibilityThreeAndFive ();
        obj.calculateSum(num);
        
    }

    void calculateSum(int n)
    {
        int tot = 0;
        for(int i = 0 ; i <= n ; i++)
        {
            if (i%3 == 0 || i%5 == 0) 
                tot+= i;
        }
        System.out.println("Total is:" +tot);
    }
}