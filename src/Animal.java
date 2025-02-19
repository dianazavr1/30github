abstract class Animal implements AnimalBehavior {
    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void eat(){
        System.out.println(name + "ест");
    }
    public void sleep(){
        System.out.println(name + "спит");
    }
    public void makeSound(){
        System.out.println(name + "издает звук");
    }

}
