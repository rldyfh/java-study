package lang.object.equals;

public class EqualsMain1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2)); // Object일 경우 == 으로 비교해서 위랑 결과가 같게 나온다. 구현 코드를 보면 알 수 있음.
    }
}
