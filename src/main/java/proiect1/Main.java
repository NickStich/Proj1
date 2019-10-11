package main.java.proiect1;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rusu", "Ion", "rusu.ion@i.co", "2000-05-26", "0733333333", 1);
        System.out.println(" ");
        Student s2 = new Student("Grigore", "Mark", "grigore.mark@i.co", "2001-05-15", "0798989898", 3);
        System.out.println(" ");
        Student s3 = new Student("Popescu", "Paul", "popescu.paul@i.co", "1999-02-08", "0723568987", 2);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(" ");

        Grupa g1 = new Grupa(1, 2, students, "Cea mai disciplinata grupa!!");
        System.out.println("__+__");
        Grupa g2 = new Grupa(2, 3, students, "Grupa cu cei mai multi medaliati!");
        Grupa g3=new Grupa (3,2,students,"Grupa cu cele mai multe restante!");
        List<Grupa> grup = new ArrayList<>();
        grup.add(g1);
        grup.add(g2);
        grup.add(g3);
        System.out.println(" ");

        Profesor p1 = new Profesor("Cioban", "Mihail", "mail", "0789356451", "asistent", 2010, true, "Matematica");
        System.out.println("___+____");
        Profesor p2 = new Profesor("Iordache", "Catalin", "email", "0734258963", "profesor", 1998, true, "Fizica");
        Profesor p3=new Profesor("Antonescu","Marius","email","0789567214","laborant",2001,false,"Informatica");
        List<Profesor> prof = new ArrayList<>();
        prof.add(p1);
        prof.add(p2);
        prof.add(p3);
        System.out.println(" ");

        Materie m1 = new Materie("Matematica", "mate", "Algebra", prof);
        System.out.println("____xxx____");
        Materie m2 = new Materie("Fizica", "fiz", "Cuantica", prof);
        Materie m3=new Materie("Informatica","inf","Java",prof);
        List<Materie> materii = new ArrayList<>();
        materii.add(m1);
        materii.add(m2);
        materii.add(m3);
        System.out.println(" ");

        Locatie l1 = new Locatie("FEAA", 400, true, "str.Pestalozzi");
        Locatie l2 = new Locatie("UVT", 150, true, "bd.Vasile Parvan");
        Locatie l3=new Locatie ("UPT",175,false,"bd.Vasile Parvan");
        List<Locatie> loc = new ArrayList<>();
        loc.add(l1);
        loc.add(l2);
        loc.add(l3);
        System.out.println(" ");

        Orar o1 = new Orar(grup, prof, loc, "10.10.2019", "10-00", "12-00", "Curs initial", materii);
        Orar o2=new Orar(grup,prof,loc,"11.09.2019","12-00","14-00","Fizica",materii);
        Orar o3=new Orar(grup,prof,loc,"11.10.2019","08-00","10-00","Bazele Java",materii);
        List<Orar> orar=new ArrayList<>();
        orar.add(o1);
        orar.add(o2);
        orar.add(o3);
        System.out.println(" ");

        Mesaj mes1 = new Mesaj(students, "2019-09-25", "Vom avea test in data de 10", grup);
        Mesaj mes2=new Mesaj(students,"2019-10-09","Nu intelegem nimic!",grup);
        Mesaj mes3=new Mesaj(students,"2019-10-20","Am reusit Hello World!",grup);
        List<Mesaj>mes=new ArrayList<>();
        mes.add(mes1);
        mes.add(mes2);
        mes.add(mes3);
        System.out.println("___________Cerinte");
        // Inceput cerinte
        System.out.println("Numarul total de studenti este: "+ Cerinte.cerinta1(students));  //cerinta 1
        System.out.println(" ");
        System.out.println("Numele studentului este: "+Grupa.cerinta2(students,2));  //cerinta2
        System.out.println(" ");

        Locatie.cerinta5(loc); // cerinta 5
        System.out.println(" ");
        Grupa.cerinta6(mes,1);  // cerinta6
        System.out.println(" ");
        Profesor.cerinta7(prof);  // cerinta 7
        System.out.println(" ");
        Profesor.cerinta10(prof); //cerinta 10




    }
}
