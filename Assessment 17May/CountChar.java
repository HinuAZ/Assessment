import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) 
    {
        String str;
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("Enter a string : ");
        str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        
        for (char character : str.toCharArray()) 
        {
         
            if (map.containsKey(character)) 
            {
                count = map.get(character);
                map.put(character, count + 1);
            } 
            else 
            {
                map.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) 
            System.out.println(entry.getKey() + " : " + entry.getValue());
        

    }

}