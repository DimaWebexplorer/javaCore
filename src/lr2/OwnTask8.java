package lr2;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class OwnTask8 {

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Dry Food");
        Bird bird = new Bird("Tweety", 1, true);

        System.out.println("Dog: " + dog.getName() + ", Age: " + dog.getAge() + ", Breed: " + dog.getBreed());
        dog.makeSound();

        System.out.println("Cat: " + cat.getName() + ", Age: " + cat.getAge() + ", Food Type: " + cat.getFoodType());
        cat.makeSound();

        System.out.println("Bird: " + bird.getName() + ", Age: " + bird.getAge() + ", Can Fly: " + bird.isCanFly());
        bird.makeSound();
    }
}
