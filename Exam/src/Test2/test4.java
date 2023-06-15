package Test2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 홍길동
 * 내용 : 자바 배욜 역순으로 정렬 연습문제
 */
public class test4 {
	public static void main(String[] args) {
		  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        
	        // 현재 배열 출력
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + ", ");
	        }
	        System.out.println();
	        
	        // 배열의 원소를 역순으로 정렬
	        for (int j = 0; j < arr.length / 2; j++) {
	            int temp = arr[j];
	            arr[j] = arr[arr.length - 1 - j];
	            arr[arr.length - 1 - j] = temp;
	        }
	        
	        // 역순으로 정렬된 배열 출력
	        for (int n : arr) {
	            System.out.print(n + ", ");
	        }
	        System.out.println();
	}
}