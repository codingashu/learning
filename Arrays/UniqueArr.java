public class UniqueArr {

	public static int minElementsToRemove(ArrayList<Integer> arr) {

	Object[] ab = arr.toArray();
	HashSet hs = new HashSet<>();
	for(int i=0;i<arr.size();i++){
		hs.add(ab[i]);
	}
	return ab.length - hs.size();
	}
}

