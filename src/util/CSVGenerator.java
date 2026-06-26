package util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CSVGenerator {

    public static void generateDataset() {

        String[] departments = {
                "CSE", "ECE", "EEE", "MCA", "MECH", "CIVIL", "IT"
        };

        String[] genders = {
                "Male", "Female"
        };

        Random random = new Random();

        try {

            FileWriter writer = new FileWriter("students.csv");

            writer.write("ID,Name,Department,CGPA,Gender,Placed\n");

            for (int i = 1; i <= 1000; i++) {

                String name = "Student" + i;

                String department =
                        departments[random.nextInt(departments.length)];

                String gender =
                        genders[random.nextInt(genders.length)];

                double cgpa =
                        6.0 + (9.9 - 6.0) * random.nextDouble();

                cgpa = Math.round(cgpa * 100.0) / 100.0;

                String placed;

                if (cgpa >= 7.5) {
                    placed = random.nextInt(100) < 80 ? "Yes" : "No";
                } else {
                    placed = random.nextInt(100) < 30 ? "Yes" : "No";
                }

                writer.write(
                        i + "," +
                        name + "," +
                        department + "," +
                        cgpa + "," +
                        gender + "," +
                        placed + "\n"
                );
            }

            writer.close();

            System.out.println("Dataset Generated Successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}