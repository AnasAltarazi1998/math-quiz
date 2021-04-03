package app;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {  
     
            System.out.println("1- resgister \n2- sign in \n3- info");
            Scanner in = new Scanner(System.in);
            int select = in.nextInt();
            switch (select) {
                case 1:
                    System.out.print("reg process .....");
                    break;
                case 2:
                    break;
                default:

                    break;
        
        }
    }
}
