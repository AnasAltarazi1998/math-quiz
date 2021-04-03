package app.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import app.model.User;

public class UserService {

    File user_path;
    FileReader fileReader;
    FileWriter fileWriter;

    public void init(User user) throws IOException
    { 
        user_path = new File("users/"+user.getEmail()+"_"+user.getName()+"_"+user.getId()+".txt");
        if(!user_path.exists()) user_path.createNewFile();
        fileReader = new FileReader(user_path);
        fileWriter = new FileWriter(user_path);
    }

    public UserService(User user) throws IOException{
       init(user);
    }
    public UserService(){}

    //TODO : CHECK IF EMAIL IS EXIST
    public boolean save(User user) throws IOException
    {
        init(user);   
        fileWriter.write("user ifo : \nname : "+user.getName()+"\nemail : "+user.getEmail()+"\npassword : "+user.getPassword()+"\nage : "+user.getAge()+"\nid : "+user.getId()+"\n created_at : "+user.getCreated_at().getTime());
        fileWriter.flush();
        return true;
    }
   
    public boolean update(User user) throws IOException
    {
        init(user);
        user = generateUser(user_path);
        save(user);
        return true;
    }

    public User findByEmail(String email) throws IOException
    {
        File searchDir = new File("users");
        File[] users_list = searchDir.listFiles();

        File detected_file = null;
        
        for (File file : users_list) {
            if(file.getName().contains(email))
                {
                    detected_file = file;
                    break;
                }
        
        }
        if(detected_file != null)
            return generateUser(detected_file);
        else
            return new User();
    }

    public User generateUser(File file) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        bufferedReader.readLine();
        String name = bufferedReader.readLine();
        name = name.substring(7,name.length());
        String email = bufferedReader.readLine();
        email = email.substring(8,email.length());
        String password = bufferedReader.readLine();
        String age = bufferedReader.readLine();
        age = age.substring(6,age.length());
        String id = bufferedReader.readLine();
        id = id.substring(5,id.length());
        String created_at = bufferedReader.readLine();
        created_at = created_at.substring(13,created_at.length());
        bufferedReader.close();
        return new User(name, email, Integer.parseInt(age), password).id(Integer.parseInt(id)).created_at(new Date(Long.parseLong(created_at)));

    }

    public User signIn(String email, String password) throws Exception
    {
        User user = findByEmail(email);
        if(user.getPassword().equals(password))
            return user;
        else 
            throw new Exception("email or password is not correct");
    }
}
