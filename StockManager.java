package products;

public class StockManager
{
    private int index;
    Product[] products = new Product[100];
    StockManager()
    {
        index = 0;
    }

    //添加产品
    public void addProduct(String productId,String productName,int productStock)
    {
        int i;
        boolean add;
        Product pd = new Product(productId,productName,productStock);
        if (index < 100)
        {
            add = true;
            for(i = 0;i < index;i++)
            {
                if(products[i].getProductId().equals(productId))
                {
                    System.out.println("仓库中已有ID为:"+productId+"的产品，无须重复添加！");
                    add = false;
                    break;
                }
            }
            if(add)
            {
                products[index] = pd;
                System.out.println("ID为"+productId+"的产品已经加入库存！");
                index++;
            }
        }

    }
    //打印产品信息
    public void printProductDetails()
    {
        int i;

        System.out.println("...........................................");
        System.out.println("================商品库存清单================");
        System.out.println("商品编号         商品名称                库存数量");
        for(i = 0 ; i <index; i++)
        {
            //变量item调用类中属性
            System.out.println(String.format("%-16s",products[i].getProductId())+
                    String.format("%-24s",products[i].getProductName())+String.format("%-16d",products[i].getProductStock()));
        }
        System.out.println("所有商品信息打印完毕...");
    }
    //搜索与其参数ID相匹配的产品
    public Product findProduct(String a_productId)
    {
        int i;
        boolean temp = false;

        for (i = 0;i<=index;i++)
        {
            if(products[i].getProductId().equals(a_productId))
            {
                temp = true;
                break;
            }
        }
        if(temp)
            return products[i];
        else
            return null;
    }
    //返回对应ID产品的库存数量
    public int numberInstock(String a_productId)
    {
        int i;
        boolean temp = false;

        for (i = 0;i<=index;i++)
        {
            if(products[i].getProductId().equals(a_productId))
            {
                temp = true;
                break;
            }
        }
        if(temp)
            return products[i].getProductStock();
        else
            return 0;
    }
    //根据给定的ID找到产品，然后调用产品的increaseQuantity方法，为该产品增加指定的库存数量
    public void delivery(String a_productId,int a_productStock)
    {
        int i;
        boolean temp = false;

        for (i = 0;i<=index;i++)
        {
            if(products[i].getProductId().equals(a_productId))
            {
                temp = true;
                break;
            }
        }
        if(temp)
            products[i].increaseQuantity(a_productStock);
        else
            System.out.println("您查找的商品不再库存中，请检查您输入的ID是否正确！");
    }
    //打印出所有库存水平低于给定值的产品的详情
    public void printLowStockProducts(int lowStock)
    {
        int i;
        for (i = 0; i < index; i++) {
            if (products[i].getProductStock() < lowStock) {
                System.out.println("商品编号："+ String.format("%-15s",products[i].getProductId()) + "商品名称：" +
                        String.format("%-15s",products[i].getProductName()) + "库存数量:"+ products[i].getProductStock());
            }
        }
    }
    //根据产品的名称在容器中搜索相匹配的产品
    public Product findProductByName(String a_productName)
    {
        int i;
        boolean temp = false;

        for (i = 0;i<index;i++)
        {
            if(products[i].getProductName().equals(a_productName))
            {
                temp = true;
                break;
            }
        }
        if(temp)
            return products[i];
        else
            return null;
    }
}
