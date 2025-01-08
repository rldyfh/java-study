package construct;

public class Book {

    String title;
    String author;
    int page;

    // this()를 사용해 중복 제거
    public Book() {
        this("", "", 0);
    }

    // this()를 사용해 중복 제거
    public Book(String title, String author){
        this(title, author, 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }


    public void displayInfo() {
        System.out.println("제목: " + title + " 저자: " + author + " 페이지: " + page);
    }


}
