package Animal;

public class Dog extends Animal {
    final int maxRun = 500;
    final int dSw = 10;
    static int dogCount = 0;
    public Dog(String name, String color, int age) {
        super(name, color, age);
        dogCount++;
        System.out.println("Зкземпляр собаки №  " + dogCount + "\n");
    }

    @Override
    public void run(int dl) {
        if (dl <= maxRun){
            System.out.printf("%s пробежал(а) %d метра(ов)\n", name, dl);
        }else{
            System.out.printf("%s не может бежать %d метроа(ов)\n", name, dl);
        }
    }


    @Override
    public void swim(int dDog) {
                if (dDog <= dSw) {
                    System.out.printf("%s проплыл(а) %d метра(ов)\n", name, dDog);
                } else {
                    System.out.println("Собака не плавает на такое расстояние\n");
                }
        System.out.println();
    }
}

