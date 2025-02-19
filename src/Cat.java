public class Cat extends Animal{
    public Cat (String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name + "мяукает: Мяу!");
    }
    public void purr(){
        System.out.println(name + "мурлычет");
    }
    public void scratch(){
        System.out.println(name + "царапает когтями");
    }
    public void climb(){
        System.out.println(name + "залезает на дерево");
    }


}
