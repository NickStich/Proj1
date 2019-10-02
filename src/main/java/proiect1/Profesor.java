package main.java.proiect1;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nume;
    private String prenume;
    private String email;
    private String telefon;
    private String grad;
    private int an_angajare;
    private boolean activ;
    private String materie;

    public Profesor(String nume, String prenume, String email, String telefon, String grad, int an_angajare, boolean activ, String materie) {
        this.nume = nume;
        System.out.println("Numele profesorului este: "+nume);
        this.prenume = prenume;
        System.out.println("Prenumele profesorului este: "+prenume);
        this.email = email;
        System.out.println("Adresa de email a profesorului este: "+nume+"."+prenume+"@gmail.com");
        this.telefon = telefon;
        System.out.println("Numarul de telefon este: "+telefon);
        this.grad = grad;
        System.out.println(grad);
        this.an_angajare = an_angajare;
        System.out.println("Anul de angajare: "+an_angajare);
        this.activ = activ;
        System.out.println("Is the teacher active: "+activ);
        this.materie = materie;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        if (grad.equals("Profesor") || grad.equals("Laborant") || grad.equals("Asistent")) {

            this.grad = grad;

        } else {
            this.grad = "error";
        }
    }

    public int getAn_angajare() {
        return an_angajare;
    }

    public void setAn_angajare(int an_angajare) {
        if (an_angajare >=1970) {
            this.an_angajare = an_angajare;
        } else {
            this.an_angajare = 0;
        }
    }

    public boolean isActiv() {
        return activ;
    }

    public void setActiv(boolean activ) {
        this.activ = activ;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }
}
