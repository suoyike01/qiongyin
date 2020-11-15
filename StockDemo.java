package products;
//Product类用来描述公司出售的产品，
//其中记录了产品的ID、名字和当前的库存。
//Product类中定义了increaseQuantity方法来提高该产品的库存级别。
//SellOne方法通过将其库存量减1来记录出售了一件该产品。

public class StockDemo
{
    public static void main(String[] args)
    {
        StockManager sm = new StockManager();
        sm.addProduct("001","apple",50);
        sm.addProduct("002","pear",300);
        sm.addProduct("003","watermelon",80);
        sm.addProduct("004","banana",60);
        sm.printProductDetails();
        printResult(sm.findProduct("003"));
        System.out.println(sm.numberInstock("002"));
        sm.delivery("001",100);
        sm.printLowStockProducts(100);
        printResult(sm.findProductByName("banana"));
        printResult(sm.findProductByName("pineapple"));

    }
    static void printResult(Product pd) {
        if (pd == null) {
            System.out.println("无法找到该产品！");
        } else {
            System.out.println("=====================");
            System.out.println("产品信息：");
            System.out.println("id：" + pd.getProductId());
            System.out.println("name：" + pd.getProductName());
            System.out.println("number：" + pd.getProductStock());
            System.out.println("=====================");
        }
    }


}
