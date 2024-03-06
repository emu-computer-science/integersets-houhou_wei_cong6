import java.util.*;
class CollectSetsOfIntegers {
    private List<SetOfIntegers> sets;
    private char nextLabel = 'A';
    private char currentLabel = '\0';

    public CollectSetsOfIntegers() {
        this.sets = new ArrayList<>();
    }

    public void addSet(List<Integer> integers) {
        sets.add(new SetOfIntegers(nextLabel, "random", integers));
        System.out.println("A new set, " + nextLabel + ", has been added: [random] " + integers + ".");
        nextLabel++;
    }

    public boolean selectSet(char label) {
        for (SetOfIntegers set : sets) {
            if (set.getLabel() == label) {
                System.out.println("Set " + label + " is now the current set: [" + set.getState() + "] " + set.getIntegers() + ".");
                currentLabel = label;
                return true;
            }
        }
        System.out.println("You input " + label + ", but there is no set " + label + ".");
        return false;
    }

    public boolean hasSets() {
        return !sets.isEmpty();
    }

    public void showSets() {
        if (sets.isEmpty()) {
            System.out.println("There are no sets to show.");
            return;
        }
        for (SetOfIntegers set : sets) {
            System.out.println(set);
        }
    }

    public void deleteCurrentSet() {
        if (currentLabel == '\0') {
            System.out.println("No set is currently selected.");
            return;
        }

        for (int i = 0; i < sets.size(); i++) {
            if (sets.get(i).getLabel() == currentLabel) {
                sets.remove(i);
                currentLabel = '\0'; // Reset currentLabel after deletion
                System.out.println("Set " + currentLabel + " has been deleted.");
                return;
            }
        }
        System.out.println("Cannot delete because the selected set does not exist.");
    }
}