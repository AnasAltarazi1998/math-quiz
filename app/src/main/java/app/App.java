package app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 1,b = 5,c = 2;
        double delta, x1, x2;
        delta = (b*b) - 4*a*c;
        if(delta > 0)
        {
            x1 = (-b-Math.sqrt(delta))/(2*a);
            x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("x1 equals : " + x1);
            System.out.println("x2 equals : " + x2);
        }
        else if(delta == 0)
        {
            x1 = (-b)/(2*a);
            System.out.println("x equals : " + x1);
        }else
        {
            System.out.println("delta is negative");
        }

        double result;

        for (int v = 1; v <= 100; v++) {
            for (int w = 1; w <= 100; w++) {
                result = Math.sqrt(v*v+w*w);
                if(result % 1 == 0)
                    System.out.println(""+v+" and "+w+" => "+result);
            }
        }

        
    }
}
