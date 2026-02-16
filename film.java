package gestionefilm;

public class Film {
private String titolo;
private double durata;
    
public Film(String titolo,double durata) {
    this.durata=durata;
    this.titolo=titolo;
}
public double getDurata() {
    return durata;
}
public void stampaInfo() {
    System.out.println("Il film si chiama : "+titolo+" e dura "+durata+" minuti.");
}
    
}
