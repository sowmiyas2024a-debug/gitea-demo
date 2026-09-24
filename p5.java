import java.util.Scanner;

 class NestedSwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a category:");
        System.out.println("1. Fruits");
        System.out.println("2. Vegetables");
        int category = sc.nextInt();

        switch (category) {
            case 1: // Fruits
                System.out.println("Select a fruit:");
                System.out.println("1. Apple");
                System.out.println("2. Mango");
                int fruit = sc.nextInt();

                switch (fruit) {
                    case 1:
                        System.out.println("You chose Apple.");
                        break;
                    case 2:
                        System.out.println("You chose Mango.");
                        break;
                    default:
                        System.out.println("Invalid fruit choice.");
                }
                break;

            case 2: // Vegetables
                System.out.println("Select a vegetable:");
                System.out.println("1. Carrot");
                System.out.println("2. Potato");
                int vegetable = sc.nextInt();

                switch (vegetable) {
                    case 1:
                        System.out.println("You chose Carrot.");
                        break;
                    case 2:
                        System.out.println("You chose Potato.");
                        break;
                    default:
                        System.out.println("Invalid vegetable choice.");
                }
                break;

            default:
                System.out.println("Invalid category choice.");
        }
    }
}