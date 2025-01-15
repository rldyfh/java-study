package lang.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {

        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println(user1 == user2); // 인스턴스가 다르다. 참조값이 다르다
        System.out.println(user1.equals(user2)); // 오버라이딩된 equals()

    }
}
