import java.util.*;

class SetOfIntegers {
	public ArrayList<Integer> setOfIntegers = new ArrayList<Integer>();
	
	public int reverse(boolean inOrder) {
		System.out.println("we are testing reverse");
		return 0;
	}
	
	//full sort function
	//using collections.sort mostly because while I could code a different sort I'm pretty sure the implementation
	//on default Collections.sort is o(nlogn) so there's no point in it
	public ArrayList<Integer> sort(boolean reverse) {
		System.out.println("Sorting SetOfIntegers");
		if(reverse) {
			Collections.sort(setOfIntegers);
		}else {
			Collections.sort(setOfIntegers, Collections.reverseOrder());
		}
		return setOfIntegers;
	}
	
	//default function call is false without parameters
	//overloaded default call for standard forward sort
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
