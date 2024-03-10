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
                currentLabel = '\0'; 
                System.out.println("Set " + currentLabel + " has been deleted.");
                return;
            }
        }
        System.out.println("Cannot delete because the selected set does not exist.");
    }

    public int sortCurrentSet() {
        if (currentLabel == '\0') {
            System.out.println("There is no currently selected set to sort.");
            return 0;
        }

        for (SetOfIntegers set : sets) {
            if (set.getLabel() == currentLabel) {
                List<Integer> integers = set.getIntegers();
                int n = integers.size();
                int swaps = 0;
                for (int i = 1; i < n; ++i) {
                    int key = integers.get(i);
                    int j = i - 1;

                    while (j >= 0 && integers.get(j) > key) {
                        integers.set(j + 1, integers.get(j));
                        j = j - 1;
                        swaps++;
                    }
                    integers.set(j + 1, key);
                }
                set.setState("increasing");
                return swaps;
            }
        }
        return 0; 
    }

    public void randomizeCurrentSet() {
        if (currentLabel == '\0') {
            System.out.println("There is no currently selected set to randomize.");
            return;
        }

        for (SetOfIntegers set : sets) {
            if (set.getLabel() == currentLabel) {
                List<Integer> integers = set.getIntegers();
                Random rand = new Random();
                int n = integers.size();
                for (int i = 0; i < n; i++) {
                    int randomIndexToSwap = rand.nextInt(n);
                    int temp = integers.get(randomIndexToSwap);
                    integers.set(randomIndexToSwap, integers.get(i));
                    integers.set(i, temp);
                }
                set.setState("random");
                return;
            }
        }
    }

    public void reverseCurrentSet() {
        if (currentLabel == '\0') {
            System.out.println("There is no currently selected set to reverse.");
            return;
        }

        for (SetOfIntegers set : sets) {
            if (set.getLabel() == currentLabel) {
                List<Integer> integers = set.getIntegers();
                Collections.reverse(integers);
                if (set.getState().equals("random")) {
                    set.setState("random");
                } else if (set.getState().equals("increasing")) {
                    set.setState("decreasing");
                } else if (set.getState().equals("decreasing")) {
                    set.setState("increasing");
                }
                System.out.println("Reversed set: " + set);
                return;
            }
        }
    }

    public char getCurrentLabel() {
        return currentLabel;
    }

    public SetOfIntegers getCurrentSet() {
        for (SetOfIntegers set : sets) {
            if (set.getLabel() == currentLabel) {
                return set;
            }
        }
        return null;
    }
}