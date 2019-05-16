//replace a word with another word
import java.io.*;
class Replaces
{
    public static void main(String[] args) {
        
        java.util.Scanner sc =  new java.util.Scanner(System.in);
        System.out.println("word to be replaced :");
            String word = sc.nextLine();
            System.out.println("enter new word:");
            String newreplace = sc.nextLine();

        

        try
        {
            File file = new File("output1.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String str; 
            String filecontent = ""; 
            while((str = reader.readLine()) != null)
            {
                str = str.replace(word,newreplace);
                filecontent = filecontent + str + "\n";
            }
            reader.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(filecontent);
            bw.flush();
            bw.close();
            
            
            
        }catch(Exception e)
        {
            System.out.println("Exception caught: "+e);
        }
    }
}