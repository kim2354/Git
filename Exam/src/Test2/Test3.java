package Test2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 김건우
 * 내용 : 자바 배열 최대값 찾기 연습문제
 */
public class Test3 {
    public static void main(String[] args) {
        int arr[] = {17, 92, 18, 33, 58, 7, 26, 48};
        int maxNum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        
        System.out.println("배열 arr에서 가장 큰 수: " + maxNum);
    }

	

}
