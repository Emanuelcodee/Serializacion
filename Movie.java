package taller3;

import java.util.Date;

public class Movie extends Film {
    private int id;

    public Movie(String creator, int duration, String gender, String title,short year,int id) {
        super(creator, duration, gender, title,year);
        this.id = id;
    }
    
    @Override
    public void guardarObjeto(){
        GestionDeArchivosPlanos.escribirMovie(this);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void stopToSee(Date timeI, Date timeF) {
        super.stopToSee(timeI, timeF);
    }

    @Override
    public Date startToSee(Date timeStart) {
        return super.startToSee(timeStart);
    }

    @Override
    public String toString() {
        return creator + ";" + duration + ";" + gender + ";" + title + ";" + year + ";" + id;
    }
    
}
