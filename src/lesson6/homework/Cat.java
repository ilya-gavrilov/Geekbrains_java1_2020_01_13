package lesson6.homework;

public class Cat extends Animal {


    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.swimmingRange = 0;
        this.runningRange = 200;
    }

    @Override
    public void run(int runDistance) {
        System.out.println("Заданная дистанция бега для " + name +": " + runDistance);
        if (runDistance < 0 || runDistance > runningRange) {
            System.out.println("Давай более реальную цель, мои коты бегают не больше, чем 200 метров!");
        } else System.out.println("Кот " + name + " пробежал " + runDistance + "м!");

    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Заданная дистанция плавания для " + name +": " + swimDistance);
        if (swimDistance != swimmingRange) {
            System.out.println("Коты не умеют плавать, даже не надейся!");
        } else System.out.println("Правильное решение не заставлять кота плавать, он все равно не умеет.");

    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
