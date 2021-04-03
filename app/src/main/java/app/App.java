package app;

import java.io.File;
import java.io.IOException;

import app.model.User;
public class App 
{
    public static void main( String[] args ) throws IOException
    {  
        User u = new User("name", "email", 20, "password");
        System.out.print(u.getCreated_at());
     
    }
}
