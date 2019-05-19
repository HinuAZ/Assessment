import java.util.Scanner;
import java.util.Arrays;

class ReverseAndSort{
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter limit: ");
		num = s.nextInt();
		int []numbers = new int[num];

		System.out.println("Enter numbers :");
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = s.nextInt();
		}

		int []result = new ReverseAndSort().getSorted(numbers);

		System.out.println("reversed and sorted numbers : " );
		for(int i = 0; i < result.length; i++){
			System.out.println(numbers[i]);
		}
	}

	public int[] getSorted(int  []numbers){
		int digit, rev = 0;
		for(int i = 0; i < numbers.length; i++){
			int temp = numbers[i];
			rev = 0;
			while(temp != 0){
				digit = temp % 10;
				rev = (rev*10) + digit;
				temp = temp / 10;
			}

			numbers[i] = rev;
		}

		Arrays.sort(numbers);
		return numbers;
	}
}