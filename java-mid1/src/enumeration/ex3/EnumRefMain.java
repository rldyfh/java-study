package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // enum은 toString()이 오버라이드 되어있음.
        System.out.println("ref BASIC = " + Grade.BASIC); // BASIC
        System.out.println("ref GOLD = " + Grade.GOLD); // GOLD
        System.out.println("ref DIAMOND = " + Grade.DIAMOND); // DIAMOND

        System.out.println("ref BASIC = " + refValue(Grade.BASIC)); // BASIC
        System.out.println("ref GOLD = " + refValue(Grade.GOLD)); // GOLD
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND)); // DIAMOND
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
