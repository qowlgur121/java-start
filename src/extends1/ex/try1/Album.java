package extends1.ex.try1;

public class Album extends Item {
    String artist;  //접근 제어자...변수는 private로 하자!

    public Album(String name, int price, String artist) { //super로 생성자...
        this.name = name;
        this.price = price;
        this.artist = artist;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격" + price);
        System.out.println("- 아티스트:" + artist);
    }
}
