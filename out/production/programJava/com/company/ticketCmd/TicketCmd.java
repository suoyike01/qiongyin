package ticketCmd;

public class TicketCmd
{
    public static int ticketPrice = 2;
    private int balance = 0;
    public int change = 0;
    public int tickets = 0;
    public int insert;

    //定义构造方法
    TicketCmd(){}

    //方法定义
    public void getInsert(int a_insert)
    {
        this.insert = a_insert;
    }

    public void getTickets(int a_tickets)
    {
        int i;
        this.tickets = a_tickets;
        for (i=0;i<tickets;i++)
        {
            System.out.println("========================\n" +
                    "This is a ticket\n" +
                    "price : 2 Yuan\n" +
                    "========================\n" );
        }
        System.out.println("这是您的"+tickets+"张票");
    }

    public void getChange()
    {
        int s;
        s = insert-tickets*ticketPrice;
        this.change = s;
        System.out.println("请收好找零 "+change+" 元");
    }

    public void getBalance()
    {
        int r;
        r = insert-tickets*ticketPrice;
        this.balance = r;
        System.out.println("当前余额： "+balance+"元");
    }

}
