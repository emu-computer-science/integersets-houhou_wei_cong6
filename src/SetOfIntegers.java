import java.util.*;

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
    
	//default function call is false without parameters
	public ArrayList<Integer> sort() {
		return sort(false);
	}
	
	public int length() {
		return setOfIntegers.size();
	}
    
	//default comparison function
	//returns the difference in size between the two sets -- set1 - set2
	//negative when s1 < s2, positive when s1>s2, 0 when s1=s2
	public int compareTo(SetOfIntegers o) {
	int s = 0;
	for(int i = 0; i < this.length(); i++) {
		s += this.setOfIntegers.get(i);
	}
	for(int i = 0; i < o.length(); i++) {
		s -= o.setOfIntegers.get(i);
	}
	return s;
	}
}
