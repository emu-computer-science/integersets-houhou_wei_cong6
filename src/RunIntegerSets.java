import java.util.Scanner;

public class RunIntegerSets {
    public static void main(String[] args) {
    	
    	SetOfIntegers test = new SetOfIntegers();
    	CollectionSetsOfIntegers testing = new CollectionSetsOfIntegers();
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter command: ");
        String command = scanner.nextLine();

        switch (command) {
            case "show":
                System.out.println("Option show selected");
                testing.show(false);
                break;
            case "new":
                System.out.println("Option new selected");
                break;
            case "select":
                System.out.println("Option select selected");
                break;
            case "delete":
                System.out.println("Option delete selected");
                break;
            case "sort":
                System.out.println("Option sort selected");
                break;
            case "reverse":
                System.out.println("Option reverse selected");
                test.reverse(false);
                break;
            case "randomize":
                System.out.println("Option randomize selected");
                break;
            case "quit":
                System.out.println("Option quit selected");
                break;
            default:
                System.out.println("Invalid option selected");
        }
        
        scanner.close();
    }
}


