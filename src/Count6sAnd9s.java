import java.util.ArrayList;
import java.util.List;

public class Count6sAnd9s {

	public int calculateNumOf6s(List<Integer> collectionOfNumbers) {
		int count6 = 0;
		for (int i = 0; i < collectionOfNumbers.size(); i++) {
			if (collectionOfNumbers.get(i) == 6) {
				count6++;

			}
		}
		return count6;

	}

	public int calculateNumOf9s(List<Integer> collectionOfNumbers) {
		int count9 = 0;
		for (int i = 0; i < collectionOfNumbers.size(); i++) {
			if (collectionOfNumbers.get(i) == 9) {
				count9++;

			}

			// sum = sum + collectionOfNumbers.get(i);
		}
		return count9;

	}

	public int con6s(List<Integer> collectionOfNumbers) {

		int conCount6 = 0;
		List<Integer> g1 = new ArrayList<>();
		g1.addAll(collectionOfNumbers);
		int i;
		int y = g1.size();
		for (i = 1; i < y; i++) {
			if (g1.get(i) == 6) {
				if ((i + 1) < g1.size()) {
					boolean a = g1.get(i - 1).equals(6);
					boolean b = g1.get(i + 1).equals(6);
					if (a || b) {
						continue;

					} else
						g1.remove(i);
					y--;
				}
			}
		}
		for (int x = 0; x < g1.size(); x++) {
			if (g1.get(x) == 6) {
				conCount6++;

			}
		}
		return conCount6;
	}

	public int con9s(List<Integer> collectionOfNumbers) {

		int conCount9 = 0;
		List<Integer> g1 = new ArrayList<>();
		g1.addAll(collectionOfNumbers);
		int i;
		int y = g1.size();
		for (i = 1; i < y; i++) {
			if (g1.get(i) == 9) {
				if ((i + 1) < g1.size()) {
					boolean a = g1.get(i - 1).equals(9);
					boolean b = g1.get(i + 1).equals(9);
					if (a || b) {
						continue;

					} else
						g1.remove(i);
					y--;
				}
			}
		}
		for (int x = 0; x < g1.size(); x++) {
			if (g1.get(x) == 9) {
				conCount9++;

			}
		}
		return conCount9;
	}

	public String NumOf6sAnd9s(int count1, int count2) {
		String result = "The count of 6 is " + count1 + " And the count of 9 is " + count2;
		// System.out.println("The count of 6 is "+count6+" And the count of 9
		// is "+count9);
		return result;
	}

	public String NumOfCon6sAnd9s(int count1, int count2) {
		String result = "Number of consecutive 6 is " + count1 + " And the Number of consecutive 9 is " + count2;
		// System.out.println("The count of 6 is "+count1+" And the count of 9
		// is "+count2);
		return result;
	}

}
