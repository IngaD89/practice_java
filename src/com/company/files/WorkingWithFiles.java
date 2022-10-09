package com.company.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) {

        String fileName = "src/data.csv";
        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName() + " created");
            } catch (IOException e) {
                System.out.println("Error creating file " + e);
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("id, name, mail");
            writer.println("1, inga, inga@gmail.com");
            writer.println("2, deme, deme@gmail.com");
            writer.flush();
            writer.close();
            System.out.println("new content created in file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            String contents = "";
            reader.readLine();

            List<User> users = new ArrayList<>();


            while ((contents = reader.readLine()) != null){
                String [] split = contents.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                String mail = split[2];
                User user = new User(id, name, mail);
                users.add(user);
            }

            reader.close();

            users.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
