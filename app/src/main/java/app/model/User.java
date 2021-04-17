package app.model;

import java.util.Date;
import java.util.Objects;

public class User {
    private static int idCount = 1;
    String name;
    String email;
    int age;
    String password;
    int id;
    Date created_at;
    

    public User() {
    }

    public User(String name, String email, int age, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.id = generateId();
        this.created_at = new Date();
    }

    public static int generateId() {
        return idCount++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public User name(String name) {
        setName(name);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User age(int age) {
        setAge(age);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User id(int id) {
        setId(id);
        return this;
    }

    public User created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email) && age == user.age && Objects.equals(password, user.password) && id == user.id && Objects.equals(created_at, user.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age, password, id, created_at);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", age='" + getAge() + "'" +
            ", password='" + getPassword() + "'" +
            ", id='" + getId() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            "}";
    }
   
}
