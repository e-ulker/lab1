package lab_1;

public class question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		specialEleven(22);
		
	}

	private static void specialEleven(int a) {
		// TODO Auto-generated method stub
		boolean s=true;
		if(a%11==0 || a%11==1) { // hoca (number-1)%11==0 durumunu da ekledi. bence sadece (number%11==1) yeterli.
			System.out.println(s);//Buyüzden o durumu yazmak bana birþey kazandýrmadýðý için yazmadým.Belki de eksik algýladým.Sormak lazým???
		}else {
			System.out.println(!s);
		}
		
	}

}
