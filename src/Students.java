import java.util.ArrayList;

public class Students {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void promoteAllStudents() {
        for (Student st : students) {
            st.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student st : students) {
            System.out.println("Current semestr of student " + st.getIndex() + " is " + st.getSemester());
        }
    }
}
