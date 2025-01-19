package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        // 오타정도는 해결이 됐으나...
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        // 그러나 다음과 같이 String을 받는걸 막을 수 없다.
        int vip = discountService.discount("VIP", price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
