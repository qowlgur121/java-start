package nested.test.ex1;

public class Library {

    private int bookCount;
    private Book books[];

    public Library(int size) {
        bookCount = 0;
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        // 검증 로직을 다 처리하고
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        //정상 로직을 처리
        books[bookCount++] = new Book(title, author);

        /*
        즉 위에서 검증 로직을 다 처리하고
        아래에서 정상 조직을 처리하면 안정감이 있다.
         */
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        /*for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }*/ //이렇게 돌리면 안된다. 배열에 빈 값이 있을 수 있기 때문에

        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    private static class Book {
        //외부에서 생성 못하게 하기 위해 private, 바깥 클래스 인스턴스를 사용 안하니까 static으로 하는게 좋다.
        /*
        private static class Book 으로 선언하면 Library 클래스 외부에서는 Book 객체를 생성할 수 없습니다.
         */
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

}
