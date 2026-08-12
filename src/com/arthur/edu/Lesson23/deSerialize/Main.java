package com.arthur.edu.Lesson23.deSerialize;

import com.arthur.edu.Lesson23.User;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(deSerialize());

    }

    public static User deSerialize() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("data.txt");
            ois = new ObjectInputStream(fis);

            User o;
            o = (User) ois.readObject();

            return o;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
