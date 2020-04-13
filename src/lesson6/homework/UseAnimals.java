package lesson6.homework;

public class UseAnimals {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Liza", "Black", 7);
        Cat cat2 = new Cat("Sonya", "Grey", 5);
        Dog dog1 = new Dog("Bobik", "White", 10);
        Dog dog2 = new Dog("Tuzik", "Brown", 11);
        Dog dog3 = new Dog("Atos", "Green", 1);

        Animal[] animals = {cat1, cat2, dog1, dog2, dog3};
        printMoves(animals);
    }

    private static void printMoves(Animal... animals) {
        for (Animal animal : animals) {
            animal.printInfo();
            animal.swim((int)(Math.random()*20));
            animal.run((int)(Math.random()*700));
            System.out.println("----------------------------------------------");
        }
    }

}
