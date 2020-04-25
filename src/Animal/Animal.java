package Animal;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info (){
        System.out.printf("%s %s %d лет/года \n", name, color, age);
    }

    public abstract void run (int dRum );

    public abstract void swim(int dSw);

}

