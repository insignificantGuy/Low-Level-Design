package shape;

public class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        double area = 3.14*radius*radius;
        System.out.println("The area of the circle is : " + area);
    }
}
