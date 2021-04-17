package app.view;

import app.model.User;

public class WelocmePage {
    public static void show(User u){
        System.out.println("welcome to our awesome project \nname : "+u.getName()+"\nemail : "+u.getEmail());
        System.out.println("1- search by email \n2- exit");
    }
}
