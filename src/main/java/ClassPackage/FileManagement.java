
package ClassPackage;

import java.io.*;

public class FileManagement {
     private static String FILE_PATH = "D:\\Saving to files\\";
    File file;
    private String FileName;
    
    public FileManagement (String fileName){
        this.FileName = fileName;
        createANewFile();
    }
 
    public boolean createANewFile(){
        try {
            file = new File(FILE_PATH + FileName);
            if (file.createNewFile()){
                System.out.println("File Created: " + file.getName());
                return true;
            }
            System.out.println("File Already Exist !");
            return false;
        } 
        catch (Exception e) {
            System.out.println("Something went wrong with creating file"+e);
            return false;
        }
           
    }

    public boolean writeDataToFile(String record) //E001 sam  22 A IT
        {
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(record);//E001 sam  22 A IT
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();

            return true;
        } catch (IOException e) {
            System.out.println("Something went wrong with writing" + e);
            return false;
        }
    }
    public BufferedReader readAFile() {
        if(!createANewFile())
        {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                return bufferedReader;
            } catch (IOException ex) {
                System.out.println("Something went wrong with Reading the file" + ex);
            }
        }       
        return null;
    }
       
}
