public class StudyProgramme {
    private String nazwa;
    private String szczegoly;
    private int iloscSemestrow;
    private int numOfITNs;

    public StudyProgramme(String nazwa, String szczegoly, int iloscSemestrow, int numOfITNs) {
        this.nazwa = nazwa;
        this.szczegoly = szczegoly;
        this.iloscSemestrow = iloscSemestrow;
        this.numOfITNs = numOfITNs;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getSzczegoly() {
        return szczegoly;
    }

    public int getIloscSemestrow() {
        return iloscSemestrow;
    }

    public int getNumOfITNs() {
        return numOfITNs;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setSzczegoly(String szczegoly) {
        this.szczegoly = szczegoly;
    }

    public void setIloscSemestrow(int iloscSemestrow) {
        this.iloscSemestrow = iloscSemestrow;
    }

    public void setNumOfITNs(int numOfITNs) {
        this.numOfITNs = numOfITNs;
    }
}
