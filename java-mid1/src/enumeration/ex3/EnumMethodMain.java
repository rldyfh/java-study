package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println(Arrays.toString(values));

        // ordinal은 가급적 사용X
        // 중간에 추가되면 순서가 바뀜.
        // 만약 데이터베이스나 파일에 저장한다면 만약 GOLD를 등급을 1로 저장했다면
        // 순서가 바뀌면 갑자기 2로 변한다던가 할 수 있다.
        //
        for (Grade value : values) {
            System.out.println("name = " + value.name() + " ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환
        String input = "GOLD";
        Grade grade = Grade.valueOf(input);
        System.out.println("gold = " + grade);
    }
}
