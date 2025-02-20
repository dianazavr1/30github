public class Book {
    String name;
    double cost;
    String author;

    Book (String name, double cost, String author){
        this.name = name;
        this.cost = cost;
        this.author = author;
    }
    @Override
    public String toString(){
        return "Book{name = " + name + ", cost = " + cost + ", author = " + author +" }";
    }

}
