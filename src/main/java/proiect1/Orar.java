package main.java.proiect1;

import java.time.LocalDate;
import java.util.List;

public class Orar {
    private List<Grupa> grupa;
    private List<Profesor> profesor;
    private List<Locatie> locatie;
    private String data;
    private String ora_inceput;
    private String ora_sfarsit;
    private String detalii;
    private List<Materie> materie;

    public Orar(List<Grupa> grupa, List<Profesor> profesor, List<Locatie> locatie, String data, String ora_inceput, String ora_sfarsit, String detalii, List<Materie> materie) {
        this.grupa = grupa;
        for (Grupa grup:grupa)
        System.out.println(grup.getId());
        this.profesor = profesor;
        for (Profesor prof:profesor){
            System.out.print(prof.getNume()+" ");
            System.out.println(prof.getPrenume());}
        this.locatie = locatie;
        for (Locatie loc:locatie){
            System.out.print(loc.getDenumire()+", ");
            System.out.println(loc.getAdresa());}
        this.data = data;
        this.ora_inceput = ora_inceput;
        this.ora_sfarsit = ora_sfarsit;
        this.detalii = detalii;
        this.materie = materie;
        for (Materie mater:materie) {
            System.out.println(mater.getDenumire());
        }
    }

    public List<Grupa> getGrupa() {
        return grupa;
    }

    public void setGrupa(List<Grupa> grupa) {
        this.grupa = grupa;
    }

    public List<Profesor> getProfesor() {
        return profesor;
    }

    public void setProfesor(List<Profesor> profesor) {
        this.profesor = profesor;
    }

    public List<Locatie> getLocatie() {
        return locatie;
    }

    public void setLocatie(List<Locatie> locatie) {
        this.locatie = locatie;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra_inceput() {
        return ora_inceput;
    }

    public void setOra_inceput(String ora_inceput) {
        this.ora_inceput = ora_inceput;
    }

    public String getOra_sfarsit() {
        return ora_sfarsit;
    }

    public void setOra_sfarsit(String ora_sfarsit) {
        this.ora_sfarsit = ora_sfarsit;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public List<Materie> getMaterie() {
        return materie;
    }

    public void setMaterie(List<Materie> materie) {
        this.materie = materie;
    }
}

