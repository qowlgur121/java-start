package extends1.ex.try1;

public class Movie extends Item {
    String director; //private..
    String actor; //private...

    public Movie(String name, int price, String director, String actor) { //super..
        this.name = name;
        this.price = price;
        this.director = director;
        this.actor = actor;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격" + price);
        System.out.println("- 감독:" + director + ", 배우" + actor);
    }
}
