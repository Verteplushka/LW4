import java.util.Objects;

public class OneKorotishka extends Korotishka implements AbleToHaveIdea{
    private Type type;
    private String idea = "noIdea";
    private final Dream dream = new Dream();

    public OneKorotishka(String name, Place place, Type type){
        super(name, place);
        this.setType(type);
    }

    public class Dream{
        private String thought = "конфетах";
        private String dream = "Солнечный город";
        public String getThought() {
            return thought;
        }
        public void setThought(String thought) {
            this.thought = thought;
        }
        public String getDream() {
            return dream;
        }
        public void setDream(String dream) {
            this.dream = dream;
        }
        public void dreamBeforeSleep() throws DreamException, KorotishkaException{
            double chance = java.lang.Math.random();
            if(chance>0.3){
                System.out.println(OneKorotishka.this.getName() + " размышляет о " + this.getThought() + " перед сном");
            }
            else if(chance>0.05){
                throw new DreamException(OneKorotishka.this.getName() + " сразу заснул");
            }
            else{
                throw new KorotishkaException("На " + OneKorotishka.this.getName() + " упал метеорит 0_0");
            }
        }

        public void forceSleep(){

        }

        public void dreamWhileSleeping(){
            System.out.println(OneKorotishka.this.getName() + " снится " + this.getDream());
        }
    }

    public void dream() throws DreamException, KorotishkaException{
        this.dream.dreamBeforeSleep();
    }

    public void forceSleep(){
        this.dream.forceSleep();
    }

    public void setThought(String thought) {
        this.dream.thought = thought;
    }
    public void setDream(String dream) {
        this.dream.dream = dream;
    }
    @Override
    public void goTo(Place place){
        System.out.println(this.getName() + " уехал в " + place);
        this.setPlace(place);
    }

    @Override
    public void read(Note note){
        System.out.println(this.getName() + " прочитал записку \"" + note.getMessage() + "\" от " + note.getWriter());
    }

    @Override
    public void understandLocation(Korotishka korotishka, Place place){
        System.out.println(this.getName() + " понял, что " + korotishka.getName() + " сейчас в " + place);
    }

    @Override
    public void setNewIdea(String idea){
        if(this.type == Type.UNPREDICTABLE){
            System.out.println(this.getName() + " решил " + idea);
        }
        else{
            System.out.println(this.getName() + " подумал, что было бы неплохо " + idea);
        }
    }

    public String getIdea() {
        return idea;
    }

    public Type getType() {
        return type;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Коротышка";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){ return false;}
        OneKorotishka oneKorotishka = (OneKorotishka) obj;
        return this.getName().equals(oneKorotishka.getName()) && this.getPlace().equals(oneKorotishka.getPlace()) && this.getType().equals(oneKorotishka.getType()) && this.getIdea().equals(oneKorotishka.getIdea());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getPlace(), this.getType(), this.getIdea());
    }
}
