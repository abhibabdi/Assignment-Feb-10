import java.io.*;
 
public class fileReplace
{   
    static void modifyFile(String file, String old, String newstr)
    {
        File modfile= new File(file);
         
        String oldone = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(modfile));
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                old = old + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            String newstr1 = old.replaceAll(old, newstr);
             
            writer = new FileWriter(modfile);
             
            writer.write(newstr1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
       
    }
     
    public static void main(String[] args)
    {
        modifyFile("C://javaprograms//idk.txt", "old", "new");
    }
}