public class Dog extends Animal{
    public Dog (String name){
        super (name);
    }
    @Override
    public void makeSound(){
        System.out.println(name + "гавкает: Гав!");
    }
    public void wagTail(){
        System.out.println(name + "виляет хвостом");
    }
    public void fetch(){
        System.out.println(name + "приносит палку");
    }
    public void guard(){
        System.out.println(name + "охраняет территорию");
    }
}
