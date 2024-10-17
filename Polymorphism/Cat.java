package Polymorphism;

class Cat extends Animal implements Pet {
    private String name;

    // Constructors
    public Cat(String name) {
        super(4); // A cat has 4 legs
        this.name = name;
    }

    public Cat() {
        this("Unnamed Cat");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats cat food.");
    }
}