package testStudent;

public class Student
{
    private String name;
    private int number;

    //定义构造方法
    Student(String aName,int aNumber)
    {
        name = aName;
        number = aNumber;
    }

    //方法定义
    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int n)
    {
        number = n;
    }
}
