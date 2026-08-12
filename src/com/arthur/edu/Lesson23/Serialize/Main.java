package com.arthur.edu.Lesson23.Serialize;

import com.arthur.edu.Lesson23.User;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        User user = new User("123s@gmail.com", "pass123");

        serialize(user);
    }

    public static void serialize(User user) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("data.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try{
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

