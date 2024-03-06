<<<<<<< HEAD
import java.util.*;

public class UserInteraction {
    private Scanner scanner;
    private CollectionSetsOfIntegers collection;
=======
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
>>>>>>> branch 'main' of https://github.com/emu-computer-science/integersets-houhou_wei_cong6.git

<<<<<<< HEAD
    public UserInteraction() {
        scanner = new Scanner(System.in);
        collection = new CollectionSetsOfIntegers();
=======
class UserInteraction {
    private CollectSetsOfIntegers sets;

    public UserInteraction(CollectSetsOfIntegers sets) {
        this.sets = sets;
>>>>>>> branch 'main' of https://github.com/emu-computer-science/integersets-houhou_wei_cong6.git
    }

<<<<<<< HEAD
    public void start() {
        String command = "";
        while (!command.equals("quit")) {
            System.out.print("The commands are show, new, select, delete, sort, reverse, randomize, save, restore, quit.  Please enter a command: ");
            command = scanner.nextLine();
            switch (command) {
                case "show":
                    collection.show(false);
                    break;
=======
    public void interact() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. New");
            System.out.println("2. Show");
            System.out.println("3. Delete");
            System.out.println("4. Select");
            System.out.println("Enter your choice (or 'exit' to quit): ");
            input = scanner.nextLine();
            switch (input.toLowerCase()) {
>>>>>>> branch 'main' of https://github.com/emu-computer-science/integersets-houhou_wei_cong6.git
                case "new":
                    System.out.println("Enter a sequence of whitespace-separated integers terminated by <RETURN>: ");
                    String integersInput = scanner.nextLine();
                    String[] integersArray = integersInput.split("\\s+");
                    List<Integer> integers = new ArrayList<>();
                    for (String s : integersArray) {
                        if (!s.isEmpty())
                            integers.add(Integer.parseInt(s));
                    }
                    sets.addSet(integers);
                    break;
<<<<<<< HEAD
                case "select":
                    System.out.print("Please select a set (A - Z): ");
                    char label = scanner.nextLine().charAt(0);
                    // Add implementation to select set
=======
                case "show":
                    sets.showSets();
>>>>>>> branch 'main' of https://github.com/emu-computer-science/integersets-houhou_wei_cong6.git
                    break;
                case "delete":
<<<<<<< HEAD
                    // Add implementation to delete set
=======
                    sets.deleteCurrentSet();
>>>>>>> branch 'main' of https://github.com/emu-computer-science/integersets-houhou_wei_cong6.git
                    break;
<<<<<<< HEAD
                case "sort":
                    // Add implementation to sort set
=======
                case "select":
                    if (sets.hasSets()) {
                        System.out.println("Enter the label of the set you want to select: ");
                        char label = scanner.nextLine().toUpperCase().charAt(0);
                        sets.selectSet(label);
                    } else {
                        System.out.println("There are no sets to select.");
                    }
>>>>>>> branch 'main' of https://github.com/emu-computer-science/integersets-houhou_wei_cong6.git
                    break;
<<<<<<< HEAD
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
=======
                case "exit":
                    System.out.println("Exiting...");
>>>>>>> branch 'main' of https://github.com/emu-computer-science/integersets-houhou_wei_cong6.git
                    break;
                default:
                    System.out.println("Invalid option.");
            }
<<<<<<< HEAD
        }
     
    }
}


=======
        } while (!input.equalsIgnoreCase("exit"));
        scanner.close();
    }
}
>>>>>>> branch 'main' of https://github.com/emu-computer-science/integersets-houhou_wei_cong6.git
