import java.util.Scanner;

class DifferenceSquareSumAndSum
{
    public static void main(String[] args) {
        
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        n = sc.nextInt();

        DifferenceSquareSumAndSum cd = new DifferenceSquareSumAndSum();
        cd.calculateDifference(n);
    }

    void calculateDifferences(int val)
    {
        int total = 0;
        int sqsum = 0;

        for(int i = 1 ; i <= val ; i++)
        {
            total = total + (int)Math.pow(i , 2);
            sqsum = sqsum + i;
        }

        int summ = (sqsum * sqsum)-total;
        System.out.println("difference =" +summ );

    }
}