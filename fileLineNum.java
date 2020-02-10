import java.io.*;
public class fileLineNum
{
public static void main(String[] args)
{
try
{

	File fl = new File("myownfile.txt");

	FileWriter fw = new FileWriter(fl);

	fw.write("I\nam\nabhishek\nbabdi\n");

	fw.flush();

	fw.close();

    FileReader in = new FileReader("myownfile.txt");

    BufferedReader buf = new BufferedReader(in);

    String line;

    int count = 1;

    line = buf.readLine();

    while (line != null)
    
    {

     System.out.println(count+" "+line);

     line = buf.readLine();

     count++;
    }

    buf.close();
    
    }

    
    catch (IOException e)
    {
    System.out.println("Something just went wrong!!!!!!!!!!!");
    }
    }
    }