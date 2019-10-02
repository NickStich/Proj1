package main.java.proiect1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private String prenume;
    private String email;
   private String dataNasterii;
   private String telefon;
   private int nr_grupa;

    public Student(String nume, String prenume, String email, String dataNasterii, String telefon, int nr_grupa) {
        this.nume = nume;
        System.out.println("Numele studentului: "+nume);
        this.prenume = prenume;
        System.out.println("Prenumele studentului: "+prenume);
        this.email = email;
        email = nume+"."+prenume+"@gmail.com";
        System.out.println("The E-mail ID is: " + email);
        System.out.println("Is the above E-mail ID valid? " + isValid(email));
        this.dataNasterii = dataNasterii;
        System.out.println("Data nasterii a studentului: "+dataNasterii);
        this.telefon = telefon;
        telefon = telefon;
        String regex = "^(\\+4|)?(07[0-8]{1}[0-9]{1}|02[0-9]{2}|03[0-9]{2}){1}?(\\s|\\.|\\-)?([0-9]{3}(\\s|\\.|\\-|)){2}$";
        System.out.println("The phone number is: " + telefon);
        System.out.println("Is the above phone number valid? " + telefon.matches(regex));
        this.nr_grupa = nr_grupa;
        System.out.println("Grupa este: "+nr_grupa);
    }
    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
}



    public String getNume() {

        return nume;
    }

    public void setNume(String nume) {


            this.nume = nume;

    }

    public String getPrenume() {
        return prenume;

    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatanasterii() {
        return dataNasterii;
    }

    public void setDatanasterii(String datanasterii) {
        this.dataNasterii = datanasterii;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getGrupa() {
        return nr_grupa;
    }

    public void setGrupa(int nr_grupa) {


            this.nr_grupa = nr_grupa;

        }

    }


