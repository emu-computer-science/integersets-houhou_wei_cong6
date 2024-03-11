import java.io.*;
import java.util.*;

class UserInteraction {
    private CollectSetsOfIntegers sets;

    public UserInteraction(CollectSetsOfIntegers sets) {
        this.sets = sets;
    }

    public void interact() {
        Scanner scanner = new Scanner(System.in);
        String input;
        printHelp(); // Print list of commands at the start
        do {
            System.out.println("Enter your choice (or 'exit' to quit): ");
            input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "new":
                    addNewSet(scanner);
                    break;
                case "show":
                    sets.showSets();
                    break;
                case "delete":
                    sets.deleteCurrentSet();
                    break;
                case "select":
                    selectSet(scanner);
                    break;
                case "sort":
                    sortSelectedSet();
                    break;
                case "randomize":
                    randomizeSelectedSet();
                    break;
                case "reverse":
                    reverseSelectedSet();
                    break;
                case "help":
                    printHelp();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                case "save":
                	System.out.println("Enter the file name to be saved: ");
                	String fileName = scanner.nextLine();
                	saveState(fileName);
                case "restore":
                	System.out.println("Enter the file name to be restored: ");
                	String loadName = scanner.nextLine();
                	loadState(loadName);
                default:
                    System.out.println("Invalid option.");
            }
        } while (!input.equalsIgnoreCase("exit"));
        scanner.close();
    }

    private void addNewSet(Scanner scanner) {
        System.out.println("Enter a sequence of whitespace-separated integers terminated by <RETURN>: ");
        String integersInput = scanner.nextLine();
        String[] integersArray = integersInput.split("\\s+");
        ArrayList<Integer> integers = new ArrayList<>();
        for (String s : integersArray) {
            if (!s.isEmpty())
                integers.add(Integer.parseInt(s));
        }
        sets.addSet(integers);
    }

    private void selectSet(Scanner scanner) {
        if (sets.hasSets()) {
            System.out.println("Enter the label of the set you want to select: ");
            char label = scanner.nextLine().toUpperCase().charAt(0);
            sets.selectSet(label);
        } else {
            System.out.println("There are no sets to select.");
        }
    }

    private void sortSelectedSet() {
        if (sets.hasSets()) {
            if (sets.getCurrentLabel() == '\0') {
                System.out.println("There is no currently selected set to sort.");
                return;
            }
            int swaps = sets.sortCurrentSet();
            System.out.println("It took " + swaps + " swaps to sort the set and resulted in " + sets.getCurrentSet());
        } else {
            System.out.println("There are no sets to sort.");
        }
    }

    private void randomizeSelectedSet() {
        if (sets.hasSets()) {
            if (sets.getCurrentLabel() == '\0') {
                System.out.println("There is no currently selected set to randomize.");
                return;
            }
            sets.randomizeCurrentSet();
            System.out.println("The set has been randomized, resulting in " + sets.getCurrentSet());
        } else {
            System.out.println("There are no sets to randomize.");
        }
    }

    private void reverseSelectedSet() {
        if (sets.hasSets()) {
            if (sets.getCurrentLabel() == '\0') {
                System.out.println("There is no currently selected set to reverse.");
                return;
            }
            sets.reverseCurrentSet();
        } else {
            System.out.println("There are no sets to reverse.");
        }
    }
    
    private void saveState(String fileName) {
    	try (FileOutputStream fos = new FileOutputStream("fileName");
    			ObjectOutputStream oos = new ObjectOutputStream(fos);){
    		oos.writeObject(sets);
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private void loadState(String fileName) {
    	try (FileInputStream fis = new FileInputStream("fileName"); ObjectInputStream ois = new ObjectInputStream(fis)){
    		sets = (CollectSetsOfIntegers) ois.readObject();
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private void printHelp() {
        System.out.println("List of commands:");
        System.out.println("new - Add a new set");
        System.out.println("show - Show all sets");
        System.out.println("delete - Delete currently selected set");
        System.out.println("select - Select a set by label");
        System.out.println("sort - Sort currently selected set");
        System.out.println("randomize - Randomize currently selected set");
        System.out.println("reverse - Reverse currently selected set");
        System.out.println("save -- Save currently selected set to disk");
        System.out.println("restore -- restore set from saved file");
        System.out.println("exit - Exit the program");
    }
}