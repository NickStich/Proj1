package main.java.proiect1;

import java.util.List;

public class Mesaj {
    private List<Student> student;
    private String timp;
    private String mesaj;
    private List<Grupa> grupa;

    public Mesaj(List<Student> student, String timp, String mesaj, List<Grupa> grupa) {
        this.student = student;
        for (Student stud:student){
            System.out.print(stud.getNume()+" ");
            System.out.println(stud.getPrenume());
        }
        this.timp = timp;
        System.out.println("Mesajul a fost postat in data de: "+timp);
        this.mesaj = mesaj;
        System.out.println("Textul mesajului este: "+mesaj);
        this.grupa = grupa;
        for (Grupa grup:grupa){
            System.out.println(grup.getId());}
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public String getTimp() {
        return timp;
    }

    public void setTimp(String timp) {
        this.timp = timp;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public List<Grupa> getGrupa() {
        return grupa;
    }

    public void setGrupa(List<Grupa> grupa) {
        this.grupa = grupa;
    }
}
