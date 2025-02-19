public class Main {
    public static void main (String[] args){
        Dog dog = new Dog("Шарик ");
        dog.makeSound();
        dog.wagTail();
        dog.fetch();
        dog.guard();

        Cat cat = new Cat("Барсик ");
        cat.makeSound();
        cat.purr();
        cat.scratch();
        cat.climb();

    }
}
