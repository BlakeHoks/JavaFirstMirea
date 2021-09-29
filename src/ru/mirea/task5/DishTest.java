package ru.mirea.task5;

public class DishTest {
    public static void main(String[] args){
        Cup cup = new Cup(500, 300, "Black Tea", "Blue");
        Pan pan = new Pan(28, "Non-stick", "Green");
        SoupPlate sp = new SoupPlate(700,0, "Red");

        System.out.println("The cup is full (" + cup.isFull() + ")");
        cup.Fill(400);
        System.out.println("Current volume is " + cup.getCurVolume() + "ml");
        System.out.println("The cup is full (" + cup.isFull() + ")");
        System.out.println(cup);

        System.out.println("Diameter is " + pan.getDiameter() + "cm");
        pan.Fry();
        System.out.println("The food is fried(" + pan.isFriedFood() + ")");
        System.out.println(pan);

        System.out.println("Soup plate max volume is " + sp.getMaxVolume());
        System.out.println("The color is " + sp.getColor());
        sp.Fill(600);
        sp.Pour(500);
        System.out.println(sp);
    }
}
