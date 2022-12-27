public class Main {
    public static void main(String[] args) {
        OneKorotishka znaika = new OneKorotishka("Знайка", Place.FLOWERTOWN, Type.UNPREDICTABLE);
        Korotishki korotishki = new Korotishki("Коротышки", Place.FLOWERTOWN);
        znaika.setThought("невесомости");
        try {
            znaika.dream();
        }
        catch (DreamException|KorotishkaException exception){
            System.out.println(exception.getMessage());
        }
        znaika.setNewIdea("поехать в Солнечный город");
        Note note = new Note(znaika, "В солнечный город");
        note.put();
        znaika.goTo(Place.SUNNYTOWN);
        Breakfast.eat(korotishki, znaika);
        korotishki.read(note);
        korotishki.understandLocation(znaika, Place.SUNNYTOWN);
        Note note2 = new Note(znaika, "Винтик, Шпунтик Солнечный город"){public void put(){
            System.out.println(this.getWriter() + " отправил сообщение \"" + this.getMessage() + "\"");
        }};
        note2.put();


    }
}