package Kotlar;

import Kotlar.Rectangle;

public class Main {

  public static void main(String[] args) {

    //для виведення прямокутника з вже записаними розмірами
    Rectangle rectangle2 = new Rectangle();
    //System.out.println(rectangle2);

    //для виведення прямокутника з даними які записаними нижче, за допомогою set
    Rectangle rectangle = new Rectangle();
    rectangle.setLength(18);
    rectangle.setWidth(40);
    //System.out.println(rectangle);

    //тут викликаються методи для розрахунку площі та периметра прямокутника
    Rectangle rectangle3 = new Rectangle();
    //rectangle3.perimeter(20,30);
    //rectangle3.area(20,30);

    //тут викликаються методи для розрахунку площі та периметра кола
    Circle circle = new Circle();
    //circle.perimeter(23.50, 54.2);
    //circle.area(23.50, 54.2);
  }
}