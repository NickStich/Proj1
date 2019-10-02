package main.java.proiect1;

import java.util.List;

public class Materie {
    private String denumire;
    private String prescurtare;
    private String detalii;
    private List<Profesor> profesor;

    public Materie(String denumire, String prescurtare, String detalii, List<Profesor> profesor) {
        this.denumire = denumire;
        System.out.println("Denumirea materie: "+denumire);
        this.prescurtare = prescurtare;
        System.out.println("Prescurtarea materiei: "+prescurtare);
        this.detalii = detalii;
        System.out.println("Detalii despre materie: "+detalii);
        this.profesor = profesor;
        for (Profesor prof:profesor){
            System.out.println("Numele profesorului este: "+prof.getNume());
        }
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getPrescurtare() {
        return prescurtare;
    }

    public void setPrescurtare(String prescurtare) {
        this.prescurtare = prescurtare;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        if (detalii.length() <= 100) {
            this.detalii = detalii;

        } else {
            this.detalii = "Max. 100 characters";
        }
    }

    public List<Profesor> getProfesor() {
        return (List<Profesor>) profesor;
    }

    public void setProfesor(List<Profesor> profesor) {
        this.profesor = profesor;
    }
}
