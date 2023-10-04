import java.util.Scanner;

public class Driver {
    private static Location currLocation;
    public static void main(String[] args) {
        currLocation = new Location("Kitchen", "This is the place where you cook food");
        currLocation.addItem( new Item("Bread", ItemType.Food, "Made from wheat"));
        currLocation.addItem( new Item("Pan", ItemType.Tool, "Used to fry food, made from steel"));
        currLocation.addItem( new Item("Fork", ItemType.Utensils, "Used to pickup food, made from stainless steel"));
        currLocation.addItem( new Item("Spoon", ItemType.Utensils, "Used to scoop or drink soup, made from stainless steel"));

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        while(true) {
            if (quit) {
                break;
            }
            
            System.out.print("Enter a command: ");
            String command = scanner.nextLine();
            String[] wordArgs = command.split(" ");
            switch(wordArgs[0]) {
                case "quit":
                    quit = true;
                    System.out.println("Bai bai!");
                    break;
                case "look":
                    System.out.println(currLocation.getName() + " - " + currLocation.getDescription() + " has the following items:");
                    for (int i = 0; i < currLocation.numItems(); i++) {
                        System.out.println("+ " + currLocation.getItem(i).getName());
                    }
                    break;
                case "examine":
                    try {
                        Item examineingItem = currLocation.getItem(wordArgs[1]);
                        if (examineingItem == null) {
                        System.out.println("Cannot find that item.");
                        break;
                        }
                        else {
                        System.out.println(examineingItem.toString());
                        break;
                        }
                    } catch (Exception e) {
                        System.out.println("Please input an item to examine.");
                        break;
                    }    
                
                default:
                    System.out.println("I don't understand what you're saying man");
                    break;
            }
        }

        scanner.close();
    }
}