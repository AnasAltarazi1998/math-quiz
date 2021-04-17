package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import app.model.User;
import app.service.UserService;
import app.view.Home;
import app.view.Registertion;
import app.view.SearchResult;
import app.view.WelocmePage;
public class App 
{
    public static void main( String[] args ) throws Exception
    {  
        Scanner in = new Scanner(System.in);
        int selectedView;
        UserService userService;
       while(true)
       {
            Home.show();
           selectedView = in.nextInt();
           switch(selectedView)
           {
               case 1:
               User u = new Registertion().show(); 
               while (true) {
                    WelocmePage.show(u);
                    selectedView = in.nextInt();
                    switch (selectedView) {
                        case 1:
                            
                            new SearchResult().show();
                            
                            break;
                    
                        default:
                            break;
                    }
                }
           }
       }
    }
}
