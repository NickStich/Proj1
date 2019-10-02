package main.java.proiect1;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rusu", "Ion", "rusu.ion@i.co", "2000-05-26", "0733333333", 1);
        System.out.println(" ");
        Student s2 = new Student("Grigore", "Mark", "grigore.mark@i.co", "2001-05-15", "0798989898", 1);
        System.out.println(" ");
        Student s3 = new Student("Popescu", "Paul", "popescu.paul@i.co", "1999-02-08", "0723568987", 2);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(" ");
        Grupa g1 = new Grupa(1, 2, students, "Cea mai disciplinata grupa!!");
        Grupa g2 = new Grupa(2, 3, students, "Grupa cu cei mai multi medaliati!");
        List<Grupa> grup = new ArrayList<>();
        grup.add(g1);
        grup.add(g2);
        System.out.println(" ");
        Profesor p1 = new Profesor("Cioban", "Mihail", "mail", "0789356451", "profesor", 2010, true, "Matematica");
        Profesor p2 = new Profesor("Iordache", "Catalin", "email", "0734258963", "profesor", 1998, true, "Fizica");
        List<Profesor> prof = new ArrayList<>();
        prof.add(p1);
        prof.add(p2);
        System.out.println(" ");
        Materie m1 = new Materie("Matematica", "mate", "Algebra", prof);
        Materie m2 = new Materie("Fizica", "fiz", "Cuantica", prof);
        List<Materie> materii = new ArrayList<>();
        materii.add(m1);
        materii.add(m2);
        System.out.println(" ");
        Locatie l1 = new Locatie("FEAA", 200, true, "str.Pestalozzi");
        Locatie l2 = new Locatie("Bibliotech", 150, true, "bd.Vasile Parvan");
        List<Locatie> loc = new ArrayList<>();
        loc.add(l1);
        loc.add(l2);
        System.out.println(" ");
        Orar o1 = new Orar(grup, prof, loc, "10.10.2019", "10-00", "12-00", "Curs initial", materii);
        System.out.println(" ");
        Mesaj mes1 = new Mesaj(students, "2019-09-25", "Voi lipsi in data de 10", grup);

    }
}
