package ref;

public class NullMain {
    public static void main(String[] args) {

        Data data = new Data();
        // new Data() 객체를 찾을 수 없다. GC가 이걸 메모리상에서 해제시킨다.
        data = null;

        data.value = 10; // NullPointerException
    }
}
