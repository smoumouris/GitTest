import java.util.LinkedList;
import java.util.Vector;
import java.util.Date;

public class Ridder {

	static LinkedList<Date> meth = new LinkedList<Date>();
	static Vector<Date> met = new Vector<Date>();

	public static Vector<Date> souchet(LinkedList<Date> meth1,
	    boolean [] tb1, boolean [] tb2) {

		Vector<Date> vector = new Vector<Date>();

		for (int i = 0; i < tb1.length; i++) {
			if (!((tb1[i]) || (tb2[i]))) {
				met.add(meth1.get(i));
			}
		}
		return met;
	}
}

