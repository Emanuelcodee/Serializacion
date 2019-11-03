package taller3;

import java.util.Date;

public class Serie extends Film {
    private int id;
    private int sessionsQuantity;

    public Serie(String creator, int duration, String gender, String title, short year,int id,int sessiosnQuantity) {
        super(creator, duration, gender, title, year);
        this.id = id;
        this.sessionsQuantity = sessiosnQuantity;
    }
    
    @Override
    public void guardarObjeto(){
        GestionDeArchivosPlanos.escribirSerie(this);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSessionsQuantity() {
        return sessionsQuantity;
    }

    public void setSessionsQuantity(int sessionsQuantity) {
        this.sessionsQuantity = sessionsQuantity;
    }

    @Override
    public void stopToSee(Date timeI, Date timeF) {
        super.stopToSee(timeI, timeF); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return creator + ";" + duration + ";" + gender + ";" + title + ";" + year + ";" + id + ";" + sessionsQuantity;
    }
}
