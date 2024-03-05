import java.util.*;

public class UserInteraction {
    private Scanner scanner;
    private CollectionSetsOfIntegers collection;

    public UserInteraction() {
        scanner = new Scanner(System.in);
        collection = new CollectionSetsOfIntegers();
    }

    public void start() {
        String command = "";
        while (!command.equals("quit")) {
            System.out.print("The commands are show, new, select, delete, sort, reverse, randomize, save, restore, quit.  Please enter a command: ");
            command = scanner.nextLine();
            switch (command) {
                case "show":
                    collection.show(false);
                    break;
                case "new":
                    System.out.print("Please enter a sequence of integers, separated by spaces, terminated by hitting <RETURN>: ");
                    String[] elementsStr = scanner.nextLine().trim().split("\\s+");
                    List<Integer> elements = new ArrayList<>();
                    for (String element : elementsStr) {
                        elements.add(Integer.parseInt(element));
                    }
                    collection.addSet(elements);
                    break;
                case "select":
                    System.out.print("Please select a set (A - Z): ");
                    char label = scanner.nextLine().charAt(0);
                    // Add implementation to select set
                    break;
                case "delete":
                    // Add implementation to delete set
                    break;
                case "sort":
                    // Add implementation to sort set
                    break;
                case "reverse":
                    // Add implementation to reverse set
                    break;
                case "randomize":
                    // Add implementation to randomize set
                    break;
                case "save":
                    // Add implementation to save set
                    break;
                case "restore":
                    // Add implementation to restore set
                    break;
                case "quit":
                    System.out.println("Quitting the program.");
                    break;
                default:
                    System.out.println("Unrecognized command. Please enter a valid command.");
                    break;
            }
        }
     
    }
}


