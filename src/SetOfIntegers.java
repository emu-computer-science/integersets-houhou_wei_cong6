import java.util.List;

class SetOfIntegers {
    private char label;
    private String state;
    private List<Integer> integers;

    public SetOfIntegers(char label, String state, List<Integer> integers) {
        this.label = label;
        this.state = state;
        this.integers = integers;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public String toString() {
        return label + ". [" + state + "] " + integers;
    }
}
