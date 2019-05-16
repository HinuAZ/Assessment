//Write a Java program that reads a file and displays the file on the screen, with a line number before each line

import java.io.*;
class linenum
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fil;
		LineNumberInputStream line;
		int i;
		try
		{
			fil=new FileInputStream("output.txt");
			line=new LineNumberInputStream(fil);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("No such file found");
			return;
		}
		do
		{
			i=line.read();
			if(i=='\n')
			{
				System.out.println();
				System.out.print(line.getLineNumber()+" ");
			}
			else
				System.out.print((char)i);
		}while(i!=-1);
		fil.close();
		line.close();
	}
}