package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.walk();
        spider.eat();

        Cat cat = new Cat("bleki");
        cat.walk();
        cat.eat();
        cat.play();

        Fish fish = new Fish();
        fish.setName("cikong");
        fish.walk(); // Will say fish can't walk
        fish.eat();
        fish.play();
    }
}