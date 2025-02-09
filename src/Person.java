class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Анна", 25);
        Person person2 = new Person("Иван", 30);

        person1.displayInfo();
        person2.displayInfo();
    }
}
