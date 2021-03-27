package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class App 
{
    public static void main( String[] args )
    {  
        int c = 0;
        String res = "";
        File f = new File("encoded.txt");
        try {
            FileReader fr = new FileReader(f);
            FileWriter fw = new FileWriter(f, true);
            fw.write(" value");
            fw.flush();
            testBuffers();
            while((c = fr.read()) != -1)
            {
                res+=(char)c;
            }
            System.out.print(res);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void testBuffers() throws IOException
    {
        File f = new File("encoded.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("bufferedwriter is writing");
        bw.flush();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(f));
        System.out.println(br.readLine());
        br.close();
    }

}
