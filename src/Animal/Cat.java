package Animal;

public class Cat extends Animal {
    final int maxRun = 200;
    static int catCount = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        catCount++;
        System.out.println("Экземпляр кошки № " + catCount + "\n");
    }

    @Override
    public void run(int dRum) {
        if (dRum <= maxRun){
            System.out.printf("%s пробежал(а) %d метра(ов)\n", name, dRum);
        }else{
            System.out.printf("%s не может бежать %d метроа(ов)\n", name, dRum);
        }
    }


    @Override
    public void swim(int x) {
        System.out.println("Кошки не умеют плавать\n");
    }
}
