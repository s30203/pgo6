import java.util.Date;
import java.util.HashMap;

public class Student {
    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private String adres;
    private String email;
    private static int indexCounter = 1;
    private String index;
    private String numerTelefonu;
    private StudyProgramme sp;
    private StudentStatus status;
    private HashMap<String, Integer> grades;
    private int numOfITNs = 0;
    private int semester = 1;

    public Student(String imie, String nazwisko, String email, String adres, String numerTelefonu, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.adres = adres;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
        this.grades = new HashMap<>();
        this.index = "s" + String.valueOf(indexCounter);
        indexCounter++;
        this.status = StudentStatus.KANDYDAT;
        Students.students.add(this);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void setIndexCounter(int indexCounter) {
        Student.indexCounter = indexCounter;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setSp(StudyProgramme sp) {
        this.sp = sp;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getEmail() {
        return email;
    }

    public static int getIndexCounter() {
        return indexCounter;
    }

    public String getIndex() {
        return index;
    }

    public StudyProgramme getSp() {
        return sp;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void enrollStudent(StudyProgramme sp) {
        this.sp = sp;
        this.status = StudentStatus.STUDENT;
    }

    public void addGrade(int grade, String subject) {
        this.grades.put(subject, grade);
        if (grade == 2) numOfITNs++;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void promoteToNextSemester() {
        if (numOfITNs < sp.getNumOfITNs() && semester != 7) semester++;
        if (semester == 7) this.status = StudentStatus.ABSOLWENT;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public int getNumOfITNs() {
        return numOfITNs;
    }

    public int getSemester() {
        return semester;
    }
}
