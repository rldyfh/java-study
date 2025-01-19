package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println(BASIC.discount(price));
        System.out.println(GOLD.discount(price));
        System.out.println(DIAMOND.discount(price));
    }
}
