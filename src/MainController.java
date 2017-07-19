import java.util.ArrayList;
import java.util.List;

public class MainController {
	public static void main(String args[])
	{
		RandomNumbergenerator rn = new RandomNumbergenerator();
		List<Integer> collection = new ArrayList<>();
		rn.generateCollection(collection);
		Count6sAnd9s c = new Count6sAnd9s();
		System.out.println(c.NumOf6sAnd9s(c.calculateNumOf6s(collection), c.calculateNumOf9s(collection)));
		System.out.println(c.NumOfCon6sAnd9s(c.con6s(collection), c.con9s(collection)));
	}

}
