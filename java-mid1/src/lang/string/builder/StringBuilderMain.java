package lang.string.builder;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String str = sb.toString();
        System.out.println("string = " + str);

        /*
            StringBuilder는 문자열을 변경할 일이 많으면 그때 쭉 쓰다가
            불변인 String으로 변환

         */
    }
}
