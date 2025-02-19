public class Dog extends Animal{
    public Dog (String name){
        super (name);
    }
    @Override
    public void makeSound(){
        System.out.println(getName() + "гавкает: Гав!");
    }
    public void wagTail(){
        System.out.println(getName() + "виляет хвостом");
    }
    public void fetch(){
        System.out.println(getName() + "приносит палку");
    }
    public void guard(){
        System.out.println(getName() + "охраняет территорию");
    }
}
