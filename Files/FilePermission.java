//File permission, read check, write check,can execute the file or not, type of the file 

import java.io.File;
import java.io.FileReader;

class FilePermission
{
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter file name..");
        String fname = sc.nextLine();
        File file = new File(fname);
        if(file.exists())
        {
            System.out.println("File exists..");
          System.out.println("Executable: " + file.canExecute()); 
            System.out.println("Is File Readable  :" +file.canRead());
            System.out.println("Is File Writable  :" +file.canWrite());
            String ext = getType(file);
            //String ext = Files.getFileExtension(path);
            System.out.println("Type of file  :" +ext);
        }
    }

    public static String  getType(File file)
    {
        String extension = "";
        String newfile = file.getName();
        int i = newfile.lastIndexOf('.');
        if (i >= 0) {
            extension = newfile.substring(i+1);
        }
        return extension;
    }
}