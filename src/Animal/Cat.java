package Animal;

public class Cat extends Animal {
    final int dlRun = 200;
    static int catCount = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        catCount++;
        System.out.println("Экземпляр кошки № " + catCount);
    }

    @Override
    public void run(int dl) {
        if (dl <= dlRun) {
            System.out.printf("%s пробежал(а) %d метра(ов)\n", name, dl);
        } else {
            System.out.println("Расстояние превышенно!\n");
        }
    }

    @Override
    public void swim(int x) {
        System.out.println("Кошки не умеют плавать\n");
    }
}
