import java.util.ArrayList;

public class Student {

    private static String name;
    private static long id;
    private static ArrayList<Integer> grades;

    public Student(long id, String name) {
        Student.id = id;
        Student.name = name;
    }


    // returns the student's id
    public long getId() {
        return id;
    }

    // returns the student's name
    public static String getName() {
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
