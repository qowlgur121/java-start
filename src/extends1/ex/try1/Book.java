package extends1.ex.try1;

public class Book extends Item {

    String author;  //private로 해야지..
    String isbn; //private로 해야지..

    public Book(String name, int price, String author, String isbn) {  //super..
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격" + price);
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
