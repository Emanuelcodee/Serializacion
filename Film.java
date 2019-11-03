package taller3;

import java.util.Date;


public class Film implements IVisualizable {
    protected String creator;
    protected int duration;
    protected String gender;
    protected int timeViewed;
    protected String title;
    protected Date viewed;
    protected short year;

    public Film(String creator, int duration, String gender, String title, short year) {
        this.creator = creator;
        this.duration = duration;
        this.gender = gender;
        this.title = title;
        this.year = year;
    }

    
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getViewed() {
        return viewed;
    }

    public void setViewed(Date viewed) {
        this.viewed = viewed;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    @Override
    public Date startToSee(Date timeStart) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void stopToSee(Date timeI, Date timeF ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Film{" + "creator=" + creator + ", duration=" + duration + ", gender=" + gender + ", timeViewed=" + timeViewed + ", title=" + title + ", viewed=" + viewed + ", year=" + year + '}';
    }
    
    public void guardarObjeto(){};
    
}
