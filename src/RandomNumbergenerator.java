import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbergenerator {
	private static final int SIZE_OF_COLLECTION = 10000000;
	private static final int MIN = 1;
	private static final int MAX = 100;

	public void generateCollection(List<Integer> collection) {
		int value = 0;
		for (int i = 0; i < SIZE_OF_COLLECTION; i++) {
			value = ThreadLocalRandom.current().nextInt(1, MAX + 1);
			collection.add(value);
		}

	}

	public static void main(String args[]) {
		int size = 0;
		RandomNumbergenerator generator = new RandomNumbergenerator();
		List<Integer> collection = new ArrayList<Integer>();
		generator.generateCollection(collection);
		if (collection.size() == SIZE_OF_COLLECTION) {
			System.out.println("size test PASS");
		} else {
			System.out.println("Fail");
		}

		//
		int count = 0;
		for (int i = 0; i < collection.size(); i++) {

			if (collection.get(i) > 0 && collection.get(i) < 100) {
				count++;

			} else {
				System.out.println("Test Range Fails!!!" + collection.get(i));
				break;
			}
			System.out.println("Unreachable in some cases!!");
		}
		if (count == SIZE_OF_COLLECTION) {
			System.out.println("Test range Pass");
		}
	}

}
