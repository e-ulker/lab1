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
			System.out.println(s);//Buy�zden o durumu yazmak bana bir�ey kazand�rmad��� i�in yazmad�m.Belki de eksik alg�lad�m.Sormak laz�m???
		}else {
			System.out.println(!s);
		}
		
	}

}
