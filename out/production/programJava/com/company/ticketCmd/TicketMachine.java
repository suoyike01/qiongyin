package ticketCmd;

import java.util.Scanner;

public class TicketMachine
{
    public static void main(String[] args)
    {
        int choice;
        int money;
        int tickets;
        TicketCmd Pc = new TicketCmd();
        Scanner input = new Scanner(System.in);
        //定义变量
        System.out.println("===============欢迎使用自动售票机===============");
        System.out.println("本机销售固定票价 "+ TicketCmd.ticketPrice +" 元的车票");
        while (true)
        {
            System.out.println("请选择服务...\n" + "1、投币\n" + "2、打印车票\n" + "3、找零\n");
            choice = input.nextInt();
            if (choice == 1)
            {
                System.out.println("请投币...");
                money = input.nextInt();
                Pc.getInsert(money);
                Pc.getBalance();
                continue;
            }
            else if (choice == 2)
            {
                System.out.println("请输入票的张数：");
                tickets = input.nextInt();
                Pc.getTickets(tickets);
                Pc.getBalance();
                continue;
            }
            else if (choice == 3)
            {
                Pc.getChange();
            }
        }

    }
}
