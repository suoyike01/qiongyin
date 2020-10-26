package computerTest;

public class Circle
{
    private double radius;
    public int circumferenceAngle=360;
    public static double pi = 3.14;

    //定义构造方法
    public void setRadius(double aRadius){this.radius = aRadius;}
    //定义方法
    public double getDiameter()
    {
        return (2*radius);
    }

    public double getcirCumference()
    {
        return (2*radius*pi);
    }

    public double getArea()
    {
        return (radius*radius)*pi;
    }
}
