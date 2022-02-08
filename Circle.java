public class Circle extends Shape{
    public Circle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return (this.getPI() * Math.pow(this.getDim1(), 2));
    }
}
