package taller3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class GestionDeArchivosPlanos {

    private static File f = new File(".\\src\\reporteFilms.txt");

    //Escritura
    private static FileWriter fw;
    private static PrintWriter pw;
    //Lectura
    private static FileReader fr;
    private static BufferedReader br;
    private static String linea;
    
    public static ArrayList<Film> leer(){
        ArrayList<Film> filmsRecuperadas = new ArrayList<Film>();
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((linea = br.readLine())!=null) {
                String cortarString[] = linea.split(";");
                if(cortarString.length == 6){
                    
                     filmsRecuperadas.add(new Movie(cortarString[0], Integer.parseInt(cortarString[1]), cortarString[2], cortarString[3], Short.parseShort(cortarString[4]), Integer.parseInt(cortarString[5])));
                }else if(cortarString.length == 7){
                    filmsRecuperadas.add(new Serie(cortarString[0], Integer.parseInt(cortarString[1]), cortarString[2], cortarString[3], Short.parseShort(cortarString[4]), Integer.parseInt(cortarString[5]),Integer.parseInt(cortarString[6])));
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error de lectura" + Arrays.toString(e.getStackTrace()));
        }
        return filmsRecuperadas;
    }
    
    public static void escribirMovie(Movie movie){
        try {
            fw = new FileWriter(f,true);
            pw = new PrintWriter(fw);
           
            pw.println(movie);
            
            pw.flush();
            
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
           System.out.println("Error de escritura "+ex);
        }
        
    }
    
    public static void escribirSerie(Serie serie){
        try {
            fw = new FileWriter(f,true);
            pw = new PrintWriter(fw);
           
            pw.println(serie);
            
            pw.flush();
            
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
           System.out.println("Error de escritura "+ex);
        }
        
    }
    
    public static void limpiar() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write("");
            bw.close();
        } catch (IOException e) {
            System.out.println("Error limpiando el archivo:" 
                    + e.getStackTrace());
        }
    }
    
    public static boolean existe(){
        return f.exists();
    }
    
    public static boolean vacio(){
      return f.length()==0;
    }

}