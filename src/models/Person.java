package models;

public class Person implements Comparable<Person> {

    private String name;
    private int id;
    private int age;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Person person) {
       return this.getAge() - person.getAge();
  
    }

}