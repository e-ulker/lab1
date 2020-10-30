package lab_1;

public class question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cigarParty(30, false);
		cigarParty(50, false);    //ctrl+shift+f düzenler
		cigarParty(70, true);

	}

	private static void cigarParty(int cigar, boolean b) {
		// TODO Auto-generated method stub

		if (b) {
			if (cigar >= 40) {
				System.out.println(b); // true
			} else {
				System.out.println(!b); // false
			}
		} else {
			if (cigar >= 40 && cigar <= 60) {
				System.out.println(!b); // true
			} else {
				System.out.println(b);// false
			}

		}
	}
}
