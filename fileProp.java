import java.io.*; 
   
class fileProp
{ 
    public static void main(String[] args) { 

        String str = args[0]; 
  
        File f = new File(str); 

        if(f.exists()) 
        { 
            System.out.println("Is writeable : "+f.canWrite()); 
            System.out.println("Is readable : "+f.canRead()); 
            System.out.println("Type of File is : "+f.isDirectory()); 
            System.out.println("File Size in bytes : "+f.length()); 
        }
        else
        {
           System.out.println("The file name that you entered doesn't exists!!!!!!!!!!"); 
        } 
    }
    } 