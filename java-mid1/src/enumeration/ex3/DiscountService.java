package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // 상수는 static import를 사용할 수 있다.
        // 이게 훨씬 코드보기에도 깔끔함
        if (grade == BASIC) {
            discountPercent = 10;
        } else if (grade == GOLD) {
            discountPercent = 20;
        } else if (grade == DIAMOND) {
            discountPercent = 30;
        }

        return price * discountPercent / 100;
    }

}
