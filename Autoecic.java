public class Autoecic {

	public static String getFourrier(String bailable, String stoneable) {
		boolean comp;
		String sum;
		int len;
		String conv;

		comp = bailable.equals(stoneable);
		sum = bailable.concat(stoneable);
		len = bailable.length();
		conv = String.valueOf(len);

		if (comp) {
			return sum;
		} else {
			return conv;
		}
	}
}



