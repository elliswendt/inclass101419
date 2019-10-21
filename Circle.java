public class Circle {
    private double radius;
    private double area;
    public Circle()
    {
        radius = 1.00;
    }
    public Circle(double r)
    {
        radius = r;
    }
    public void computeRadius(){
        area = (Math.PI * (Math.pow(radius, 2.00)));
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
    }
}
