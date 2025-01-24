package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

/*
    throws Exception을 하면 다른 체크 예외까지 한꺼번에 던져서 체크를 해야하는 예외까지 다 던져버림..., 무슨 예외를 던지는지 모름..
    체크 예외를 사용한다면 잡을건 잡고 던질건 명확하게 던져야함.
    해당 클래스에서 중요한것은 클래스내에서 예외를 잡고 예제의 network 예외나 sendData 예외 같이 처리할 수 없는 경우는 밖으로 모두 던져서 한군데서 공통으로 예외를 잡아 처리 -> 메세지, 로그를 남긴다.

    진짜 중요한 예외를 만들어서 잡아서 처리해야할 경우 체크 예외를 씀. (사실 이것도 런타임 예외를 고려해보자...)
    그렇지 않은 경우 런타임 예외를 만들자
    즉 대부분 런타임 예외로 처리하자
 */
public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch(Exception e) {
                exceptionHandler(e);
            }


            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 알 수 없는 문제가 발생했습니다.");
        e.printStackTrace(System.out); // System.out 표준 출력
//        e.printStackTrace(); // System.err 표준 오류에 출력, 둘의 스트림이 다르다.

        if(e instanceof SendExceptionV4 sendEx) { // e를 다운캐스팅
            System.out.println("[전송 오류] 전송 데이터: " + sendEx);
        }
    }
}
