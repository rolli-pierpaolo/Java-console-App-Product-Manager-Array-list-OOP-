package gestionefilm;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Film>film=new ArrayList<>();
        int scelta;
        
        do {
            System.out.println("===MENU===\n1)Inserisci film;\n2)Visualizza film e statistiche;\n3)Esci.");
            scelta=scanner.nextInt();
            scanner.nextLine();
            
            if(scelta==1) {
                System.out.println("Inserisci titolo film :");
                String titolo=scanner.nextLine();
                System.out.println("Inserisci durata del film :");
                double durata=scanner.nextDouble();
                scanner.nextLine();
                while(durata<=0) {
                    System.out.println("La durata di un film non puo essere inferiore. riprova");
                    durata=scanner.nextDouble();
                    scanner.nextLine();
                }
                Film F=new Film(titolo,durata);
                film.add(F);
                System.out.println("Dati Film inseriti correttamente.");
                
            }
            if(scelta==2) {
                if(film.size()==0) {
                    System.out.println("Non ci sono film inseriti.");
                }
                
            else {
                    double somma =0;
                    
                    
                    Film filmMax = film.get(0);
                    Film filmMin = film.get(0);

                    for (Film f : film) {

                        if (f.getDurata() > filmMax.getDurata()) {
                            filmMax = f;
                        }

                        if (f.getDurata() < filmMin.getDurata()) {
                            filmMin = f;
                        }
                    }

                    System.out.println("\n--- ELENCO FILM ---");
                    double media=somma/film.size();
                    System.out.println("Somma durata film: " + somma);
                    System.out.println("Media durata dei film: " + media);
                    System.out.println("Film con durata maggiore: " + filmMax);
                    System.out.println("Film con durata minore : " + filmMax);
                
                
            }
            
        }
        
        
    
    
        
    }while(scelta !=3);
        System.out.println("Programma terminato.");
   
}}
