package shape;

public class Square extends Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public void calculateArea(){
        int area = side*side;
        System.out.println("The area of square is : "+ area);
    }
}
