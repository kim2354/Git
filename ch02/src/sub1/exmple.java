package sub1;

public class exmple {
	public static void main(String[] args) {
		
	}
	int num1 = 1;

	int num2 = 2;

	int num3 = 3;

	int num4 = 4;

	int result1  = num1 + num2;

	int result2  = num1 - num2;

	int result3  = num2 * num3;

	int result4  = num4 / num2;

	int result5  = num4 % num2;

	System.out.println(result1 + result1);

	System.out.println(result2 + result2);

	System.out.println(result3 + result3);

	System.out.println(result4 + result4);

	System.out.println(result5 + result5);

}
//증감 연산자

 int num = 0;

num++;

++num;

System.out.println("num : " +num);

num-- ;

--num ;

System.out.println("num :"+num);
//복합대입연산

int n1 = 1, n2 = 2 , n3 = 3, n4 = 4;



n1 += 1; // n1 = n1 +1

n2 -=2;  // n2 = n2 -2

n3 *= 3; // n3 = n3 *3

n4 /= 4; // n4 = n4 /4

System.out.println("n1 :"+n1 );
System.out.println("n2 :"+n2 );

System.out.println("n3 :"+n3 );

System.out.println("n4 :"+n4 );
}
//비교연산

int var1 =1;

int var2 =2;

boolean rs1 = var1 > var2; // var1은 var2보다 크다.

boolean rs2 = var1 < var2; // var1은 var2보다 크다.

boolean rs3 = var1 >= var2;// var1은 var2보다 크거나 같다

boolean rs4 = var1 <= var2;// var1은 var2보다 작거나 같다

boolean rs5 = var1 == var2;// var1은 var2보다 서로 같다

boolean rs6 = var1 != var2;// var1은 var2보다 서로 다르다

System.out.println("rs1 :"+rs1);

System.out.println("rs2:"+rs2);

System.out.println("rs3:"+rs3);

System.out.println("rs4:"+rs4 );

System.out.println("rs5:" +rs5);

System.out.println("rs6:"+rs6);
//산술연산자

int var3 = 3;
int var4 = 4;

boolean res1 = (var3 > 3) && (var4 > 3); // var3은 3보다 크고 그리고 var4는 3보다 작다.

boolean res2 = (var3 > 2) && (var4 > 3); //var3은 3보다 크고 그리고 var4는 3보다 작다.

boolean res3 = (var3 > 3) || (var4 > 3);//var3은 3보다 크거나 var4는 3보다 작다.

boolean res4 = (var3 > 3) || (var4 > 3);//var3은 3보다 크거나  var4는 5보다 작다.

boolean res5 = !(var3 > var4);//var3은 var4 크지 않다.

System.out.println("res1:"+ res1);

System.out.println("res2:"+ res2);

System.out.println("res3:"+ res3);

System.out.println("res4:"+ res4);

System.out.println("res5:"+ res5);
//논리연산자
public class Main {
public static void main(String[] args) {
int num1 = 10;
int num2 = 5;
int num3 = 7;
// 논리 AND 연산
boolean result1 = (num1 > num2) && (num1 > num3);
System.out.println(result1);  // true

// 논리 OR 연산
boolean result2 = (num1 > num2) || (num1 > num3);
System.out.println(result2);  // true

// 논리 NOT 연산
boolean result3 = !(num1 > num2);
System.out.println(result3);  // false
}





