package Prime_Sieve;

public class palindrom_in_n_squre_oreder {

	public static void main(String[] args) {
		String s = "NITIN";
		System.out.println(countpalin(s));
	}

	public static int countpalin(String s) {
		int count = 0;
		//for odd
		for (int axis = 0; axis < s.length(); axis++) {

			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {

				if (s.charAt(axis - orbit) == s.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}
		//for even no of char in string
		for (double axis = 0.5; axis < s.length(); axis++) {

			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {

				if (s.charAt((int)(axis - orbit)) == s.charAt((int)(axis + orbit))) {
					count++;
				} else {
					break;
				}
			}
		}
		return count;
	}
}
