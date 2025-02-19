public class Cat extends Animal{
    public Cat (String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(getName() + "мяукает: Мяу!");
    }
    public void purr(){
        System.out.println(getName() + "мурлычет");
    }
    public void scratch(){
        System.out.println(getName() + "царапает когтями");
    }
    public void climb(){
        System.out.println(getName() + "залезает на дерево");
    }


}
