package app.view;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import app.model.User;
import app.service.UserService;

public class Registertion {
    User u = new User();
    UserService userService = new UserService();
    public User show() throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("name : ");
        u.name(in.nextLine());
        System.out.println("email : ");
        u.email(in.nextLine());
        System.out.println("password : ");
        u.password(in.nextLine());
        System.out.println("age : ");
        u.age(in.nextInt());
        u.id(User.generateId());
        u.created_at(new Date());
        if(userService.save(u))
        {
            return u;
        }else {
            throw new Exception("can not save this user");
        }
        
    }
}
