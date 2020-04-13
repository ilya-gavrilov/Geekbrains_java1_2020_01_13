package lesson6.homework;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int swimmingRange;
    protected int runningRange;

    public abstract void run(int runDistance);
    public abstract void swim(int swimDistance);

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void printInfo() {
        System.out.printf("Кличка = %s; Цвет = %s; Возраст = %d%n",
                getName(),
                getColor(),
                getAge());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
