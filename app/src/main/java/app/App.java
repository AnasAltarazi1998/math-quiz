package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App 
{
    public static void main( String[] args )
    {  
        OutputStreamWriter osr = null;
        InputStreamReader isr = new InputStreamReader(System.in);
        char[] c = new char[20];
        try 
        {
            isr.read(c, 0, c.length-1);
            String user_input = String.copyValueOf(c);
            osr = new OutputStreamWriter(System.out);
            osr.write(user_input);
            osr.write(testFileOutput(user_input.getBytes())); 
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(osr != null)
                    osr.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static String testFileOutput(byte[] by) throws IOException
    {
        File f = new File("encoded.txt");
        boolean b = !f.exists() ? f.createNewFile() : false; 
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(by);
        fos.close();

        FileInputStream fis = new FileInputStream(f);
        byte[] res = fis.readAllBytes();
        fis.close();
        return new String(res);
    }
}
