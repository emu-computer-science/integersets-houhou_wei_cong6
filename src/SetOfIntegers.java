import java.util.*;

class SetOfIntegers {
    private char label;
    private String state;
    private ArrayList<Integer> integers = new ArrayList<Integer>();

    public SetOfIntegers(char label, String state, ArrayList<Integer> integers) {
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

    public void setIntegers(ArrayList<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public String toString() {
        return label + ". [" + state + "] " + integers;
    }
    
	//full sort function
	public ArrayList<Integer> sort(boolean reverse) {
		System.out.println("Sorting SetOfIntegers");
		if(reverse) {
			Collections.sort(integers);
		}else {
			Collections.sort(integers, Collections.reverseOrder());
		}
		return integers;
	}
    
	//default function call is false without parameters
	public ArrayList<Integer> sort() {
		return sort(false);
	}
	
	public int length() {
		return integers.size();
	}
    
	//default comparison function
	//returns the difference in size between the two sets -- set1 - set2
	//negative when s1 < s2, positive when s1>s2, 0 when s1=s2
	public int compareTo(SetOfIntegers o) {
	int s = 0;
	for(int i = 0; i < this.length(); i++) {
		s += this.integers.get(i);
	}
	for(int i = 0; i < o.length(); i++) {
		s -= o.integers.get(i);
	}
	return s;
	}
}
