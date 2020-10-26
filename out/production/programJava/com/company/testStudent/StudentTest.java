package testStudent;

public class StudentTest
{
    public static void main(String[] args)
    {
        Student s = new Student("Tom",9901);
        System.out.println("I am "+s.getName()+".My number is "+s.getNumber());//调用方法改动属性
        s.setNumber(9902);//支持改动
        System.out.println("My number was changed.It is "+s.getNumber());
    }
}
