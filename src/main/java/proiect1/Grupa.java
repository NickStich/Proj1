package main.java.proiect1;

import java.util.List;

public class Grupa {
    private int id;
    private int an;
    private List<Student> students;
    private String mesaj;


    public Grupa(int id, int an, List<Student> students, String mesaj) {
        this.id = id;
        if (id >= 1 && id <= 10) {
            System.out.println("Id-ul grupei este: "+id);
        } else {
            System.out.println("Nr. grupei este invalid!");
        }

        this.an = an;
        System.out.println("Anul grupei este: "+an);
        this.students = students;
        for (Student student:students) {
            if (id == student.getGrupa()) {
                System.out.println("____xx____");
                System.out.println(student.getNume());
                System.out.println(student.getPrenume());
            }
        }
        this.mesaj = mesaj;
        System.out.println(mesaj);

    }
    public static String cerinta2(List<Student> student,int gr) {
        String rez="";
        for (Student st:student) {
            if (st.getGrupa() == gr) {
               rez= st.getNume();
            }
        }
        return rez;
    }
    public static void cerinta6(List<Mesaj>mesaj,int id){
        for (Mesaj mes:mesaj){
            System.out.println("Mesajul grupei este: "+mes.getMesaj());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
       this.id=id;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        if (an >= 1 && an <= 6) {
            this.an = an;
        } else {
            System.out.println("Invalid number of group!");;
        }
    }

    public List<Student> getStudent() {
        return students;
    }

    public void setStudents(List<Student> student) {
        this.students = student;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}
