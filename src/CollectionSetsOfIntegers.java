import java.util.*;

class CollectionSetsOfIntegers {
	public HashMap<Character, SetOfIntegers> colset = new HashMap<Character, SetOfIntegers>();
	public char mostRecent;
	public int show(boolean inOrder) {
		System.out.println("we are testing show");
		return 0;
	}
	
	
	// all delete functions
	/* TODO: Best practices would probably be to name them all something different to be honest
	 * I will probably come back and use the overloaded calls in order  to create a few functions that do the same thing while having
	 * more clear naming, but that's a task for another day.
	*/
	// delete() without value input will delete most recent key
	public char delete() {
		if (colset.containsKey(mostRecent)){
			colset.remove(mostRecent);
		}
		return mostRecent;
	}
	
	// delete with toDelete key deletes the key from hashmap
	public char delete(char toDelete) {
		if(colset.containsKey(toDelete)) {
			colset.remove(toDelete);
		}
		return toDelete;
	}
	
	// delete with setofintegers toDelete deletes EVERY key, value pair from the hashmap matching the set provided
	public ArrayList<Character> delete(SetOfIntegers toDelete) {
		ArrayList<Character> deleteKeys = new ArrayList<Character>();
		for(HashMap.Entry<Character, SetOfIntegers> entry : colset.entrySet()) {
			if(entry.getValue().equals(toDelete)) {
				deleteKeys.add(entry.getKey());
			}
		}
		for(char d : deleteKeys) {
			colset.remove(d);
		}
		return deleteKeys;
	}
}