package Polymorphism;

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider eats insects.");
    }
}