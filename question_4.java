package lab_1;


public class question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deerplay(70,false);
		deerplay(95,false);
		deerplay(95,true);

	}

	private static void deerplay(int temp,boolean summer) {
		// TODO Auto-generated method stub
		if(summer)
		if(temp>=60 && temp<=90) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}else {
			if(temp>=60 && temp<=100) { // soruda Unless it is summer, then the upper limit is 100 instead of 90. diyordu.Benim anlad���m
				System.out.println(true);// yaz olmazsa, dereceyi 90 yerine 100 yap diyor burda.Evet mant�ks�z ancak soruda b�yle diyor ve ben bunu anlad�m
			}else {						//buy�zden hocan�n yapt��� gibi yapmad�m.ya soru yanl��,yada ben ingilizce yazan� yanl�� anlad�m.
				System.out.println(false);
			}
		}
		
		
	}

}
