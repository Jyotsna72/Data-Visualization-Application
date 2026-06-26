package analytics;

import java.util.ArrayList;

import model.Student;

public class AnalyticsService {

    public static int totalStudents(ArrayList<Student> students) {
        return students.size();
    }

    public static int maleCount(ArrayList<Student> students) {

        int male = 0;

        for(Student s : students) {

            if(s.getGender().equalsIgnoreCase("Male")) {
                male++;
            }
        }

        return male;
    }

    public static int femaleCount(ArrayList<Student> students) {

        int female = 0;

        for(Student s : students) {

            if(s.getGender().equalsIgnoreCase("Female")) {
                female++;
            }
        }

        return female;
    }

    public static int placedCount(ArrayList<Student> students) {

        int placed = 0;

        for(Student s : students) {

            if(s.getPlaced().equalsIgnoreCase("Yes")) {
                placed++;
            }
        }

        return placed;
    }

    public static int notPlacedCount(ArrayList<Student> students) {

        int notPlaced = 0;

        for(Student s : students) {

            if(s.getPlaced().equalsIgnoreCase("No")) {
                notPlaced++;
            }
        }

        return notPlaced;
    }

    public static double averageCGPA(ArrayList<Student> students) {

        double total = 0;

        for(Student s : students) {
            total += s.getCgpa();
        }

        return total / students.size();
    }
}