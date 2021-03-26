package app;

import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class App 
{
    public static void main( String[] args )
    {   
       
          try {
           Double[] solves = solveDelta(1, 9, 3);
           
           for (Double double1 : solves) 
               System.out.println(double1);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } 
        
    }

    public static Double[] solveDelta(int a, int b, int c) throws Exception {
        double delta = b*b - 4*a*c;
        Double[] solves = new Double[2];
        if(delta > 0)
        {
            solves[0] = (-b-Math.sqrt(delta))/(2*a);
            solves[1] = (-b+Math.sqrt(delta))/(2*a);
            return solves;
        }else if(delta == 0)
        {
            solves[0] = Double.valueOf((-b)/(2*a));
            solves[1] = Double.valueOf((-b)/(2*a));
            return solves;
        }else 
        {
           throw new Exception("delta less than zero");
        }
    }
}
