package computerTest;

public class Trapezium
{
    private double upperBase;
    private double bottomBase;
    private double height;

    //定义构造方法
    public void setUpperBase(double a_upperBase){this.upperBase=a_upperBase;}
    public void setBottomBase(double a_upperBase){this.bottomBase=a_upperBase;}
    public void setHeight(double a_upperBase){this.height=a_upperBase;}

    //方法定义
    public double getArea()
    {
        return (upperBase+bottomBase)*height*0.5;
    }


}
