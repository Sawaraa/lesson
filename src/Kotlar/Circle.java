package Kotlar;

public class Circle {
  double radius;
  double diameter;

  Circle(){

  }
  Circle(double radius, double diameter){
    this.radius = radius;
    this.diameter = diameter;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getDiameter() {
    return diameter;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Circle{");
    sb.append("radius=").append(radius);
    sb.append(", diameter=").append(diameter);
    sb.append('}');
    return sb.toString();
  }

  public void perimeter(double radius, double diameter){
    double P = 2*(radius * diameter);
    System.out.println("Периметр кола " + P);
  }

  public void area(double radius, double diameter){
    double S = radius * diameter;
    System.out.println("Площа кола " + S);
  }
}
