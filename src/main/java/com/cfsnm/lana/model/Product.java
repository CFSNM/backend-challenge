package com.cfsnm.lana.model;

public class Product
{
    private PRODUCT_TYPE productType;

    public PRODUCT_TYPE getProductType()
    {
        return this.productType;
    }

    public void setProductType(PRODUCT_TYPE productType)
    {
        this.productType = productType;
    }
}


enum PRODUCT_TYPE
{
    PEN("PEN","Lana Pen",5.00),
    TSHIRT("TSHIRT", "Lana T-Shirt",20.00),
    MUG("MUG","Lana Coffee Mug", 7.50);

    String code;
    String name;
    double price;

    PRODUCT_TYPE(String code, String name, double price)
    {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "PRODUCT_TYPE{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    static PRODUCT_TYPE getProductTypeByCode(String code)
    {
        PRODUCT_TYPE product_type = null;
        switch(code)
        {
            case "PEN":
                product_type = PRODUCT_TYPE.PEN;
                break;
            case "TSHIRT":
                product_type = PRODUCT_TYPE.TSHIRT;
                break;
            case "MUG":
                product_type = PRODUCT_TYPE.MUG;
                break;
            default:
                throw new RuntimeException("Unsupported Product Type: " + code);
        }

        return product_type;
    }
}
