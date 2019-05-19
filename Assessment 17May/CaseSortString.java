import java.util.Scanner;
import java.util.Arrays;

class CaseSortString{
	public static void main(String[] args) {
		String []arr = new String[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings to be sorted");
		String input = sc.nextLine();
		arr = input.split("\\s"); 
		Arrays.sort(arr);

		int len = arr.length;

			if((len % 2) == 0){
				for(int i = 0; i < len/2 ; i++)
				{
					System.out.println(arr[i].toUpperCase());
				}
				for(int i = len/2 ; i < len ;i++)
				{
					System.out.println(arr[i].toLowerCase());
				}
				

			}
			else{
				for(int i = 0; i < len/2 + 1 ; i++)
				{
					System.out.println(arr[i].toUpperCase());
				}
				for(int i = len/2 + 1 ; i < len ;i++)
				{
					System.out.println(arr[i].toLowerCase());
				}
			}
			

	}
}				