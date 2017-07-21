import java.util.Arrays;
import java.util.List;

public class MainController {
	public static void main(String args[]) {
		MainController m = new MainController();
		Count6sAnd9s c = new Count6sAnd9s();

		/*
		 * RandomNumbergenerator rn = new RandomNumbergenerator(); List<Integer>
		 * collection = new ArrayList<>(); long startTime =
		 * System.currentTimeMillis(); rn.generateCollection(collection);
		 * System.out.println(c.NumOf6sAnd9s(c.calculateNumOf6s(collection),
		 * c.calculateNumOf9s(collection)));
		 * System.out.println(c.NumOfCon6sAnd9s(c.con6s(collection),
		 * c.con9s(collection))); long endTime = System.currentTimeMillis();
		 * long totalTime = endTime - startTime;
		 * System.out.println("The TotalRunTime is " + totalTime + " ms");
		 */

		// Test Cases

		List<Integer> test1 = Arrays.asList(3, 6, 9, 9, 6, 6, 6, 9, 6, 9, 7, 66, 2, 6, 4, 3, 6, 6, 6, 4, 3, 5, 8, 9, 9,
				99, 4, 6, 6, 5, 9, 9, 2, 3);
		List<Integer> test2 = Arrays.asList(7, 3, 9, 8, 9, 2, 6, 6, 9, 9, 7, 1, 9, 3, 6, 99, 9, 9, 9, 4, 6, 6, 9, 6, 9,
				4, 5, 3, 9, 6, 3, 9, 9);
		m.exampleTestCase(c.calculateNumOf6s(test1), 11, "No. of 6's");
		m.exampleTestCase(c.calculateNumOf9s(test1), 8, "No. of 9's");
		m.exampleTestCase(c.calculateNumOf6s(test2), 7, "No. of 6's");
		m.exampleTestCase(c.calculateNumOf9s(test2), 13, "No. of 9's");
		m.exampleTestCase(c.con6s(test1), 8, "No. of Consecutive 6's");
		m.exampleTestCase(c.con9s(test1), 6, "No. of Consecutive 9's");
		m.exampleTestCase(c.con6s(test2), 4, "No. of Consecutive 6's");
		m.exampleTestCase(c.con9s(test2), 7, "No. of Consecutive 9's");

	}

	public void exampleTestCase(int a, int b, String whichTest) {
		if (a == b) {

			System.out.println("Test Pass for " + whichTest);
		} else {
			System.out.println("Test Fail for " + whichTest);
		}
	}

}
