class UserInteraction {
    private Scanner scanner;
    private CollectionSet collection;

    public UserInteraction() {
        scanner = new Scanner(System.in);
        collection = new CollectionSet();
    }

    public void start() {
        String command = "";
        while (!command.equals("quit")) {
            System.out.print("The commands are show, new, select, delete, sort, reverse, randomize, save, restore, quit.  Please enter a command: ");
            command = scanner.nextLine();
            switch (command) {
                case "show":
                    collection.showSets();
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
                    collection.selectSet(label);
                    break;
                case "delete":
                    collection.deleteSet();
                    break;
                case "sort":
                    // Implement sort functionality
                    break;
                case "reverse":
                    // Implement reverse functionality
                    break;
                case "randomize":
                    // Implement randomize functionality
                    break;
                case "save":
                    // Implement save functionality
                    break;
                case "restore":
                    // Implement restore functionality
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

public class RunIntegerSets {
    public static void main(String[] args) {
        UserInteraction ui = new UserInteraction();
        ui.start();
    }
}