package generic.test.ex1;

import generic.test.ex1.unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T out = shuttle.out();
        System.out.println("이름: " + out.getName() + ", HP: " + out.getHp());
    }

    // 와일드 카드는 상한 클래스로 리턴이 고정
    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit out = shuttle.out();
        System.out.println("이름: " + out.getName() + ", HP: " + out.getHp());
    }
}
