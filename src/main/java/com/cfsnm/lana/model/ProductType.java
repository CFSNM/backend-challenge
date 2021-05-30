package com.cfsnm.lana.model;

public enum ProductType
{
        PEN("PEN","Lana Pen",5.00),
        TSHIRT("TSHIRT", "Lana T-Shirt",20.00),
        MUG("MUG","Lana Coffee Mug", 7.50);

        String code;
        String name;
        double price;

        ProductType(String code, String name, double price)
        {
            this.code = code;
            this.name = name;
            this.price = price;
        }

        public String getCode()
        {
            return code;
        }

        public String getName()
        {
            return name;
        }

        public double getPrice()
        {
            return price;
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

}
