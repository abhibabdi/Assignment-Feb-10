import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
 
 class fileWordCount1 
{   
    public static void main(String[] args) 
    {
        BufferedReader reader = null;
         
        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;
         
        try
        {
             
            reader = new BufferedReader(new FileReader("myownfile1.txt"));
             
            String currentLine = reader.readLine();
             
            while (currentLine != null)
            {
                 
                lineCount++;
                 
                 
                String[] words = currentLine.split(" ");
                 
                 
                wordCount = wordCount + words.length;
                 
                 
                for (String word : words)
                {    
                    charCount = charCount + word.length();
                }
                 
                currentLine = reader.readLine();
            }
             
            
            System.out.println("Number Of Characters In A File : "+charCount);
             
            System.out.println("Number Of Lines In A File : "+wordCount);
             
            System.out.println("Number Of Words In A File : "+lineCount);
        } 
        catch (IOException e) 
        {
           System.out.println("Something Just Went Wrong!!!!!!!!!!!");
        }
        
    }   
}