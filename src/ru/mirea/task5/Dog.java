package ru.mirea.task5;

public abstract class Dog {
    protected int age;
    protected int height;
    protected int weight;
    protected String name;
    protected String breedName;

    public Dog(int age, int height, int weight, String name){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void InHumanYears(){
        System.out.println("Age in human years is " + age * 7);
    }

    public void getOlder(){
        age += 1;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreedName() {
        return breedName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", breedName='" + breedName + '\'' +
                '}';
    }
}
