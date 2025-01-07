package class1;

public class Student {

    // 클래스에 속한 변수
    // 멤버 변수 or 필드 라고 불림
    String name;
    int age;
    int grade;

    public static void main(String[] args) {

        // Student 객체를 생성하고 이 참조값을 student1에 저장한다.
        Student student1 = new Student();
        student1.name ="A";
        student1.age = 16;
        student1.grade = 3;

        System.out.println(student1);
    }

}
