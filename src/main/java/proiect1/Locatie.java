package main.java.proiect1;

import java.util.List;

public class Locatie {
    private String denumire;
    private int capacitate;
    private boolean activa;
    private String adresa;

    public Locatie(String denumire, int capacitate, boolean activa, String adresa) {
        this.denumire = denumire;
        if (denumire.length()<=5) {
            this.denumire = denumire;
        }else{
            this.denumire="Only 5 characters is allowed";
        }
        System.out.println("Denumirea locatiei: "+this.denumire);
        this.capacitate = capacitate;
        if (capacitate > 50 && capacitate < 300) {
            this.capacitate = capacitate;
        } else {
            this.capacitate = -1;
        }
            System.out.println("Capacitatea locatie: "+this.capacitate);
        this.activa = activa;
        System.out.println(activa);
        this.adresa = adresa;
        System.out.println("Adresa locatiei: "+adresa);
    }
    public static void cerinta5(List<Locatie> locat) {
        String rez="";
        for (Locatie loc : locat) {
            if (loc.activa == true) {
                System.out.println("Locatia activa este: "+loc.denumire);
            }
        }

    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {

            this.denumire = denumire;

    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(Integer capacitate) {
        this.capacitate=capacitate;

    }
    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
