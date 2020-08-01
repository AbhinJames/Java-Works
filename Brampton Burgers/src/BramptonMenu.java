import java.util.ArrayList;

public class BramptonMenu
{
    private Burger selectedBurger;
    private ArrayList<Toppings> selectedToppings = new ArrayList<>();
    private ArrayList<Burger> allBurgers = new ArrayList<>();


    public BramptonMenu()
    {
        Burger basicBurger = new BasicBurger();
        Burger healthyBurger = new HealthyBurger();
        Burger deluxeBurger = new DeluxeBurger();

        Toppings tomato = new Toppings("Tomato",0.27);
        Toppings lettuce = new Toppings("Lettuce",0.72);
        Toppings cheese = new Toppings("Cheese",1.13);
        Toppings carrot = new Toppings("Carrot",2.75);
        Toppings paneer = new Toppings("Paneer",1.27);
        Toppings pickles = new Toppings("Pickles",0.77);

        allBurgers.add(basicBurger);
        allBurgers.add(healthyBurger);
        allBurgers.add(deluxeBurger);

        basicBurger.setToppings(tomato);

    }





    public void DisplayMenu()
    {
        System.out.println("Brampton Burgers");
        System.out.println("``````````````````");
        System.out.println("-------------------");

        for(Burger burger : allBurgers)
        {
            System.out.print((allBurgers.indexOf(burger)+1)+" ");
            //System.out.println(burger.getBurgerName());
            System.out.println(burger.toString());
            System.out.println("-----------------------");

        }
    }


}
