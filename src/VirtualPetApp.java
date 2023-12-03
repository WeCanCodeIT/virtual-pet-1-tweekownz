import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please name your Pet: ");
        String name = scanner.nextLine();
        VirtualPet pet1 = new VirtualPet(name);
        int userChoice;
        pet1.petStats();

      do {
        System.out.println("\nWhat would you like to do with your Pet?");
        System.out.println("Enter 1 to Feed");
        System.out.println("Enter 2 to water");
        System.out.println("Enter 3 to play");
        System.out.println("Enter 4 to do nothing");
        System.out.println("Enter 5 to abandon your pet");
        userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                pet1.feed();
                break;
            case 2:
                pet1.water();
                break;
            case 3:
                pet1.play();
                break;
            case 4:
                break;
            case 5:
                System.out.println("Oh no my feeling!");
                break;
            default:
                    System.out.print("Please enter a valid selection: 1 = Feed, 2 = Water, 3 = Play, 4 = Do nothing, 5 = Don't leave me");
                break;
        }
        pet1.tick();
            } while (userChoice != 5);


        







        scanner.close();
    }
}
