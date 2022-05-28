import java.util.ArrayList;
import java.util.Arrays;

public class OccuranceAndRepeated {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 5, 5, 7, 6, 6, 4, 5));
		System.out.println(list);
		System.out.println(removeAllrepeted(list, list.size() - 1));
		removeAllOccurrance(list, 7);
		System.out.println(list);
	}

	private static void removeAllOccurrance(ArrayList<Integer> list, Integer element) {
		if (list.contains((Integer) element)) {
			list.remove((Integer)element);
			removeAllOccurrance(list, element);
		}
		
	}

	private static ArrayList<Integer> removeAllrepeted(ArrayList<Integer> list, int Index) {
		ArrayList<Integer> temp = new ArrayList<>(list);
		if (Index > 0) {
			if (temp.indexOf(temp.get(Index)) != temp.lastIndexOf(temp.get(Index))) {
				temp.remove(Index);
			}
			return removeAllrepeted(temp, Index - 1);
		} else {

			return list;
		}
	}

}
