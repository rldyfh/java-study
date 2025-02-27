package generic.test.ex1;

import generic.test.ex1.unit.BioUnit;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        return t1.getHp() >= t2.getHp() ? t1 : t2;
    }
}
