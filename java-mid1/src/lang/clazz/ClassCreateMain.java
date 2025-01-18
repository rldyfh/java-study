package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {

        /*
            java reflection
            Class를 사용해서 인스턴스를 만들거나 메서드를 사용하는 것.
         */
//        Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");

        Hello helloObj = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result = helloObj.hello();
        System.out.println(result);

    }
}
