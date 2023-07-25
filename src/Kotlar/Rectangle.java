package Kotlar;

import java.util.OptionalInt;

public class Rectangle {

  int length;
  int width;

  Rectangle (){
    this.length = 50;
    this.width = 20;
  }

  Rectangle(int length, int width){
    this.length = length;
    this.width = width;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "Lenght " + length + " Width " + width;
  }

  //// Метод для розрахунку периметра
  public void perimeter(int length, int width){
    int P = 2*(length * width);
    System.out.println("Периметр прямокутника  " + P);
  }

  //// Метод для розрахунку площі
  public void area(int length, int width){
    int S = length * width;
    System.out.println("Площа прямокутника " + S);
  }

}
