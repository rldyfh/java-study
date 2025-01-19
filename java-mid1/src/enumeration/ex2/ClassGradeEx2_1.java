package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;

        /*
            타입 안전 열거형 패턴
         */

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        // 메서드의 파라미터만 봐서 직접 객체를 생성해줘야하나? 해서 객체를 직접 넣어줄 수도 있다.
        // DiscountService의 생성자를 private으로 정의하자
        // int newDiscount = discountService.discount(new ClassGrade(), price);
        //  System.out.println(newDiscount);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
