package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {

        /*
            String 사용 시 타입 안정성 부족 문제
               - 값의 제한 문제 -> 잘못된 문자열을 입력 가능하다.
               - 컴파일 시 오류 문제 -> 런타임시에만 문제가 발견되기 때문에 디버깅이 어려울 수 있다.
         */

        int price = 10000;
        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println(vip);

        // 문자열 입력, 실수할 가능성
        int diamond = discountService.discount("DIAMONDD", price);
        System.out.println(diamond);

    }
}
