public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MushroomPizza();
        pizza.getPizza();
        System.out.println();
        pizza = new PizzaWithToppings(pizza);
        pizza.getPizza();
    }
}