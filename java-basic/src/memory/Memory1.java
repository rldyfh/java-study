package memory;

public class Memory1 {

    /*
        자바의 메모리 구조는 메서드영역, 스택 영역, 힙 영역이 있다.

        1. 메서드 영역 (뭔가 method == 방법 이니까 논리적인 이론적인 이런 설계서 같은 느낌... and 진짜 java method)
            - 클래스 정보, 필드, 메서드, 생성자 코드 등 모든 실행 코드가 존재한다.
            - static영역, static 변수 보관
            - 런타임 상수 풀, 프로그램을 실행하는데 필요한 공통 리터럴 상수를 보관한다.

        2. 스택 영역
            - 자바 실행 시, 하나의 실행 스택이 생성. 각 스택 프레임(호출 시 쌓이는 하나의 스택)은 지역 변수, 중간 연산 결과, 메서드 호출 정보등을 포함
            - 메서드가 호출 될 때마다 스택 영역에 프레임이 하나씩 쌓인다.
            - 스택 영역은 쓰레드별로 하나의 스택 영역이 생김.

        3. 힙 영역
            - 객체, 배열이 생성되는 영역. GC가 관리한다.

        ※ 객체가 생성되면 힙 영역에 생기지만 객체가 들고 있는 메서드들은 전부 같다.
           메서드는 공통된 코드를 공유한다. 그리고 이 공통된 코드는 메서드 영역에 존재하게 된다.
           즉 객체가 100개 만들어져도 그 100개가 가지고 있는 메서드 코드는 공통되므로 메서드 영역에 생성되어 이를 참조하는 형식.
     */


}
