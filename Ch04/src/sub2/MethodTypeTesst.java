package sub2;
/**
 * 날짜 :20230/06/15
 * 이름: 김건우
 * 내용 :JavaMehtodTypeTest
 */

public class MethodTypeTesst {
	public static void main(String[] args) {
	double	r1 = type1(1.1);
	double r2 = type1(2.1);
	 
	 System.out.println("r1 : "+r1);
	 System.out.println("r2 : "+r2);
	 
	 type2(true);
	 type2(false);
	 
	boolean r3 = type3();
	System.out.println("r3"+r3);
	type4();
	
	}
	//형태1 : 매개변수O : 리턴값 O
	public static double type1(double x) {
		double y = x + 3.14;
		return = y;
	//형태2 : 매개변수 O 리턴값 X
		public static void type2(boolean status) {
			if(status){
				System.out.println("참 입니다.");
			}else {
				System.out.println("거짓 입니다.");
			}
		}
	//형테3 : 매개변수 x : 리턴값 o
		public static boolean type3() {
			int num1 = 1;
			int num2 = 2;
			
			if(num1 > num2) {
				return true;
			}else {
				return false;
			}
		}
	//형태4 : 매개변수 x, 리턴값 x
		public static void type4() {
			double result = type1(0.3);
			System.out.println("type4 실행결과 :" + result);
		}

}
