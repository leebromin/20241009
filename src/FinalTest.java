public class FinalTest {
    public static void main(String[] args) {
        int temperature = 20;  // 변수 선언 및 초기화
        final int fp = 0;  // 상수 선언 및 초기화

        // 변수 값 변경
        temperature = 25;  // 'temperature' 변수의 값을 25로 변경
        System.out.println("Current temperature: " + temperature);

        /* 상수 값 변경 시도 (컴파일 오류 발생)
        fp = 10;  // 이 코드는 컴파일 오류를 발생시킵니다.*/

        System.out.println("Freezing point of water: " + fp);
    }
}
