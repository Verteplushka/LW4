public abstract class Korotishka extends Creature implements AbleToGoTo, AbleToRead, AbleToUnderstandLocation{
    private Place place;
    public Korotishka(String name, Place place){
        super(name);
        this.place = place;
    }
    public abstract void goTo(Place place);
    public abstract void read(Note note);
    public abstract void understandLocation(Korotishka korotishka, Place place);

    public Place getPlace(){
        return this.place;
    }

    public void setPlace(Place place){
        this.place = place;
    }

}
