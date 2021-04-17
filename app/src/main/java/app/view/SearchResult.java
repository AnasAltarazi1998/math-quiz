package app.view;

import java.io.IOException;
import java.util.Scanner;

import app.model.User;
import app.service.UserService;

public class SearchResult {
    Scanner in = new Scanner(System.in);
    UserService userService = new UserService();
    public void show() throws IOException{
        System.out.println("enter email address : ");
        User u = userService.findByEmail(in.next());
        System.out.println(u.toString());
    }
}
