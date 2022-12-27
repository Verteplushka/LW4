import java.util.Objects;

public class Korotishki extends Korotishka{

    public Korotishki(String name, Place place){
        super(name, place);
    }
    @Override
    public void goTo(Place place){
        System.out.println(this.getName() + " пришли " + place);
    }

    @Override
    public void read(Note note){
        System.out.println(this.getName() + " прочитали записку \"" + note.getMessage() + "\" от " + note.getWriter());
    }

    @Override
    public void understandLocation(Korotishka korotishka, Place place){
        System.out.println(this.getName() + " поняли, что " + korotishka.getName() + " сейчас в " + place);
    }

    @Override
    public String toString(){
        return "Коротышки";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){ return false;}
        Korotishki korotishki = (Korotishki) obj;
        return this.getName().equals(korotishki.getName()) && this.getPlace().equals(korotishki.getPlace());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getPlace());
    }
}
