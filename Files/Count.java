//Write a Java program that displays the number of characters, lines and words in a text read from a file

import java.io.*; 
  
public class Count 
{ 
    public static void main(String[] args) throws IOException 
    { 
        File file = new File("C:\\Users\\HennaAzeez\\Desktop\\output.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
          
        while((line = reader.readLine()) != null) 
        { 
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                String[] wordList = line.split("\\s+"); 
                  countWord += wordList.length; 
                String[] sentenceList = line.split("[.]+"); 
                  sentenceCount += sentenceList.length; 
            } 
        } 
          
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
    } 
} 