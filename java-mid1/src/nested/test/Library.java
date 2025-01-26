package nested.test;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }


    public void addBook(String title, String author) {

        // 정상 로직과 검증 로직 분리
        if(books.length <= bookCount) {
            System.out.println("도서관 저장 공간 부족");
            return;
        }
        books[bookCount++] = new Book(title, author);

        // 정상 로직과 검증 로직이 섞여있다.
//        if(bookCount < books.length) {
//            books[bookCount++] = new Book(title, author);
//        } else {
//            System.out.println("도서관 저장 공간 부족");
//        }
    }

    public void showBooks() {
//        for (int i = 0; i < bookCount; i++) {
//            System.out.println("도서 제목: " + books[i].title + " 저자: " + books[i].author);
//        }

        // 외부 클래스, 내부 클래스끼린 변수를 공유해서 사용할 수 있다.
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            System.out.println("도서 제목: " + book.title + " 저자: " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
