import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class UserInteraction {
    private CollectSetsOfIntegers sets;

    public UserInteraction(CollectSetsOfIntegers sets) {
        this.sets = sets;
    }

    public void interact() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. New");
            System.out.println("2. Show");
            System.out.println("3. Delete");
            System.out.println("4. Select");
            System.out.println("5. Sort");
            System.out.println("6. Randomize");
            System.out.println("7. Reverse");
            System.out.println("8. Save");
            System.out.println("9. Restore");
            System.out.println("Enter your choice (or 'exit' to quit): ");
            input = scanner.nextLine();
            switch (input.toLowerCase()) {
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
                case "show":
                    sets.showSets();
                    break;
                case "delete":
                    sets.deleteCurrentSet();
                    break;
                case "select":
                    if (sets.hasSets()) {
                        System.out.println("Enter the label of the set you want to select: ");
                        char label = scanner.nextLine().toUpperCase().charAt(0);
                        sets.selectSet(label);
                    } else {
                        System.out.println("There are no sets to select.");
                    }
                    break;
                case "sort":
                case "randomize":
                case "reverse":
                case "save":
                case "restore":
                    System.out.println("Still being tested.");
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (!input.equalsIgnoreCase("exit"));
        scanner.close();
    }
}