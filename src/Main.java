
import Animal.Cat;
import Animal.Dog;

public class Main {
    public static void main (String[] args ){
        Cat cat = new Cat("Мурзик","белый", 5);
        cat.info();
        cat.run(25);
        cat.swim(23);
        Cat cat1 = new Cat("Буся", "серый", 1);
        cat1.info();
        cat1.run(250);
        cat1.swim(23);

        Dog dog = new Dog("Тузик", "черный", 3);
        dog.info();
        dog.run(400);
        dog.swim(5);
        Dog dog1 = new Dog("Каштан", "коричневый", 5);
        dog1.info();
        dog1.run(600);
        dog1.swim(10);
        }
    }

