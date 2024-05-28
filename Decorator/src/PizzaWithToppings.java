public class PizzaWithToppings extends PizzaDecorator
{

    public PizzaWithToppings(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public void getPizza()
    {
        pizza.getPizza();
        addToppings();

    }

    private void addToppings()
    {
        System.out.print(" with toppings");
    }

}