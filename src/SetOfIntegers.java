import java.util.*;

class SetOfIntegers {
	public ArrayList<Integer> setOfIntegers = new ArrayList<Integer>();
	
	public int reverse(boolean inOrder) {
		System.out.println("we are testing reverse");
		return 0;
	}
	
	//full sort function
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
    public ArrayList<Integer> sort() {
        return sort(false);
    }
    
}
