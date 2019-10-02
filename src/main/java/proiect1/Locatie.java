package main.java.proiect1;

public class Locatie {
    private String denumire;
    private int capacitate;
    private boolean activa;
    private String adresa;

    public Locatie(String denumire, int capacitate, boolean activa, String adresa) {
        this.denumire = denumire;
        System.out.println("Denumirea locatiei: "+denumire);
        this.capacitate = capacitate;
        System.out.println("Capacitatea locatie: "+capacitate);
        this.activa = activa;
        System.out.println(activa);
        this.adresa = adresa;
        System.out.println("Adresa locatiei: "+adresa);
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        if (denumire.length()<=5) {
            this.denumire = denumire;
        }else{
            this.denumire="Only 5 characters is allowed";
        }
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(Integer capacitate) {
        if (capacitate > 50 && capacitate < 300) {
            this.capacitate = capacitate;
        } else {
            this.capacitate =0;
        }

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
