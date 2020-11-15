package products;

public class Product
{
    //初始化属性
    private String productId;   //商品号
    private String productName; //商品名称
    private int productStock;

    //获取属性
    Product(String productId,String productName,int productStock)
    {
        this.productId = productId;
        this.productName = productName;
        this.productStock = productStock;
    }
    //定义构造方法
    // 提高产品库存数量
    public void increaseQuantity(int a_productStock)
    {
        this.productStock += a_productStock;
    }

    //记录出售一件该产品
    public void sellOne()
    {
        this.productStock --;
    }

    //打印产品的详细详细
    public void getProductDetails()
    {
        System.out.println("ID:"+productId+" Name:"+productName+" Stock:"+productStock);
    }
    //获取货物信息
    public String getProductId()
    {
        return productId;
    }
    public String getProductName()
    {
        return productName;
    }
    public int getProductStock()
    {
        return productStock;
    }
}
