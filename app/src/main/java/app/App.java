package app;

import java.io.File;
import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {   
        File f = new File("test123123123.txt");
       if(!f.exists())
       {
            try {
                f.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.print(f.length());
        System.out.print(f.getAbsolutePath());
    }
}
