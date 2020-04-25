package Animal;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    private int maxRun;
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info (){
        System.out.printf("%s %s %d лет/года \n", name, color, age);
    }

    public void run (int dRum ){
        if (dRum <= maxRun){
            System.out.printf("%s пробежал(а) %d метра(ов)", name, dRum);
        }else{
            System.out.printf("%s не может бежать %d метроа(ов)", name, dRum);
        }
    }

    public abstract void swim(int d);
}

