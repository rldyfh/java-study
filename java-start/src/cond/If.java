package cond;

public class If {
    public static void main(String[] args) {
        int age = 6;

        // age 를 중복 체크하는 로직.
        // age <= 7 과 8 <= age 에서 age <= 7 이 아니면 이미 8 이상인걸 알 수 있다. (age >= 8 중복 체크)
        if(age <= 7)
            System.out.println("미취학");
        if(8 <= age && age <= 13)
            System.out.println("초등학생");
        if(14 <= age && age <= 16)
            System.out.println("중학생");

        // 중복 체크를 빼는 로직
        if(age <= 7)
            System.out.println("미취학");
        else if(age <= 13)
            System.out.println("초등학생");
        else if(age <= 16)
            System.out.println("중학생");
        else
            System.out.println("~~~");


        // new switch 문 (java 14~)
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 " + coupon);


    }
}
