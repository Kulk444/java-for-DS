import java.util.Scanner;

class CoffeeMaker {
    private int coffeeBeans;
    private int water;
    private int milk;

    public CoffeeMaker(int coffeeBeans, int water, int milk) {
        this.coffeeBeans = coffeeBeans;
        this.water = water;
        this.milk = milk;
    }

    public void showMenu() {
        System.out.println("Available drinks:");
        System.out.println("1. Espresso (3 beans, 1 water)");
        System.out.println("2. Americano (2 beans, 3 water)");
        System.out.println("3. Latte (2 beans, 2 milk, 2 water)");
    }

    public void makeDrink(int choice, int customBeans, int customWater, int customMilk) {
        if (coffeeBeans >= customBeans && water >= customWater && milk >= customMilk) {
            coffeeBeans -= customBeans;
            water -= customWater;
            milk -= customMilk;
            System.out.println("Your drink is ready!");
        } else {
            System.out.println("Not enough ingredients!");
        }
    }

    public void refill(int beans, int water, int milk) {
        this.coffeeBeans += beans;
        this.water += water;
        this.milk += milk;
        System.out.println("Ingredients refilled!");
    }

    public void displayIngredients() {
        System.out.println("Coffee Beans: " + coffeeBeans);
        System.out.println("Water: " + water);
        System.out.println("Milk: " + milk);
    }

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(10, 10, 10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            coffeeMaker.showMenu();
            System.out.println("Enter your choice (1-3) or 0 to exit:");
            int choice = scanner.nextInt();

            if (choice == 0) break;

            System.out.println("Customize ingredients (Enter 0 to use default values):");
            System.out.print("Coffee Beans: ");
            int beans = scanner.nextInt();
            System.out.print("Water: ");
            int water = scanner.nextInt();
            System.out.print("Milk: ");
            int milk = scanner.nextInt();

            if (beans == 0 || water == 0 || milk == 0) {
                if (choice == 1) coffeeMaker.makeDrink(choice, 3, 1, 0);
                if (choice == 2) coffeeMaker.makeDrink(choice, 2, 3, 0);
                if (choice == 3) coffeeMaker.makeDrink(choice, 2, 2, 2);
            } else {
                coffeeMaker.makeDrink(choice, beans, water, milk);
            }

            coffeeMaker.displayIngredients();
        }
        scanner.close();
    }
}