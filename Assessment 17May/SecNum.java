import java.util.Scanner;

class SecNum
{
public static void main(String[] args) {
		
		SecNum obj = new SecNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide The limit of numbers which you want to enter");
		int count = sc.nextInt();
        sc.nextLine(); 
    
    System.out.println("Enter the numbers :");
        int [] num = new int[count];
        for (int i = 0; i < count; i++) {
            if (sc.hasNextInt()) {
                num[i] = sc.nextInt();
            } 
            else {
                System.out.println("pls check!");
                break;
            }
        }
       
        for(int x : num){
          {
        	System.out.print( x+ " ");
          }
        }
        System.out.println();
  System.out.println("The array after sorting:");
        

        System.out.println("Second Smallest number is:" +obj.getSecSmall(num));
	}	

	public int getSecSmall(int[] temp)
	{
		int x;
		int n = temp.length;
		for(int i = 0; i < n; i++) {
         for(int j=1; j < n-i; j++) {
            if(temp[j-1] > temp[j]) { 
               x = temp[j-1]; 
               temp[j-1] = temp[j];
               temp[j] = x;
            } 
         } 

      } 
      for(int k : temp)
      	System.out.println(k);
      return temp[1];
      
	}
}