package construct;

public class MemberThis {

    public String nameField;
    public int age;

    // 생성자가 아래와 같이 하나라도 있으면 기본생성자는 자동 생성되지 않는다.
//    MemberThis() {
//
//    }

    MemberThis(String name, int age) {
        nameField = name;
        this.age = age;
    }

    MemberThis(String name) {
        // this() 로 생성자 호출
        // this()는 무조건 첫줄에서만, 아니면 컴파일 오류
        this(name, 10);


        // 멤버변수와 파라미터가 서로 다르다. this 를 쓰는걸 권장하지 않음.
        this.nameField = name;
        // 이렇게 쓰자.
        nameField = name;
    }

}
