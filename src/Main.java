public class Main {
    public static void main (String[] args){
        AnimalBehavior myDog = new Dog("Рекс ");
        AnimalBehavior myCat = new Cat("Барсик ");

        myCat.makeSound();
        myDog.makeSound();
    }
}

