import java.util.List;

public class Count6sAnd9s {
	public int calculateNumOf6s(List<Integer> collectionOfNumbers) {

		int sum = 0;
		int count6 = 0;
		for (int i = 0; i < collectionOfNumbers.size(); i++) {
			if (collectionOfNumbers.get(i) == 6) {
				count6++;

			}

			// sum = sum + collectionOfNumbers.get(i);
		}
		return count6;

	}

	public int calculateNumOf9s(List<Integer> collectionOfNumbers) {

		int sum = 0;
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

		int conCount6 = 2;
		for (int i = 0; i < collectionOfNumbers.size(); i++) {
			if (collectionOfNumbers.get(i) == 6) {
				if ((i + 1) < collectionOfNumbers.size()) {
					if (collectionOfNumbers.get(i) == collectionOfNumbers.get(i + 1)) {
						conCount6 = conCount6 + 1;
					}

				}
			}

		}
		if (conCount6 == 1) {
			conCount6 = 0;
		}
		return conCount6;
	}

	public int con9s(List<Integer> collectionOfNumbers) {

		int conCount9 = 2;
		// ListIterator ls = collectionOfNumbers.listIterator();
		for (int i = 0; i < collectionOfNumbers.size(); i++) {
			if (collectionOfNumbers.get(i) == 9) {
				if ((i + 1) < collectionOfNumbers.size()) {
					if (collectionOfNumbers.get(i) == collectionOfNumbers.get(i + 1)) {
						conCount9 = conCount9 + 1;
					}
				}
			}
		}
		if (conCount9 == 1) {
			conCount9 = 0;
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
