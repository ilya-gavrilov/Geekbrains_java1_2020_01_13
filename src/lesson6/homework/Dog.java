package lesson6.homework;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.swimmingRange = 10;
        this.runningRange = 500;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void run(int runDistance) {
        System.out.println("Заданная дистанция бега для " + name +": " + runDistance);
        if (runDistance < 0 || runDistance > runningRange) {
            System.out.println("Давай более реальную цель, мои собаки бегают не больше, чем 500 метров!");
        } else System.out.println("Собака " + name + " пробежала " + runDistance + "м!");

    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Заданная дистанция плавания для " + name +": " + swimDistance);
        if (swimDistance < 0 || swimDistance > swimmingRange) {
            System.out.println("Мои собаки не плавают дальше десяти метров!");
        } else System.out.println("Собака " + name + " проплыла " + swimDistance + "м!");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
