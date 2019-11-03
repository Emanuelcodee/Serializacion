
package taller3;

import java.util.ArrayList;

public class Taller3 {

   
    public static void main(String[] args) {
        
        ArrayList<Film> films = new ArrayList<>();
        
        
//        films.add(new Movie("Baran Bo", 106, "Drama", "Who am I",(short) 2014, 001));
//        films.add(new Serie("kevin space", 4,"Drama", "house of cards",(short) 2018, 002, 1200));
//        films.add(new Movie("jhon x", 90, "Accion", "Matrix", (short) 2011, 003));
//        films.add(new Serie("Iniesta M", 2, "Accion", "La casa de papel", (short) 2018, 004, 2400));
        

        //Recupera del archivo plano
        films = GestionDeArchivosPlanos.leer();
        
        //Guarda en AP
//        for (int i = 0; i < films.size(); i++) {
//            films.get(i).guardarObjeto();
//        }
        
        //Lee del ArayList
        for (int i = 0; i < films.size(); i++) {
            System.out.println(films.get(i).getCreator());
        }
        
        
    }
    
    
}
