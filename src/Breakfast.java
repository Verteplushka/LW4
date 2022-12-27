public class Breakfast{
    private Breakfast(){}
    public static void eat(Korotishka ... korotishkaArray){
        for(Korotishka korotishka : korotishkaArray){
            if(korotishka.getPlace() != Place.FLOWERTOWN){
                System.out.println(korotishka.getName() + " не пришел на завтрак");
            }
        }

        class Dish {
            private int ordinalNumber;
            private String name;
            public Dish(int ordinalNumber, String name) {
                this.ordinalNumber = ordinalNumber;
                this.name = name;
            }

            public void serveDish(){
                System.out.println("Сегодня на завтрак блюдо номер " + this.ordinalNumber + " - " + this.name);
            }
        }
        Dish dish1 = new Dish(1, "Овсяная каша");
        Dish dish2 = new Dish(2, "Яичница с беконом");
        Dish dish3 = new Dish(3, "Кофе с круассаном");

        dish1.serveDish();
        dish2.serveDish();
        dish3.serveDish();

    }
}
