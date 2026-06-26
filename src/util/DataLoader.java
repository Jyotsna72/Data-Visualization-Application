package util;

import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("students.csv"));

            String line;

            br.readLine(); // Skip Header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double cgpa = Double.parseDouble(data[3]);
                String gender = data[4];
                String placed = data[5];

                Student student = new Student(
                        id,
                        name,
                        department,
                        cgpa,
                        gender,
                        placed
                );

                students.add(student);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }
}