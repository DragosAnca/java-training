package code._4_student_effort.AnimalHierarchy;

public class Fish extends Animal implements Pet{
    private String name;
    public Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("The fish is eating");
    }

    @Override
    public void walk() {
        System.out.println("Fishes can't walk");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The fish is playing");
    }
}
