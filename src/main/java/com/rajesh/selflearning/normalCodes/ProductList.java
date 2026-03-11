package com.rajesh.selflearning.normalCodes;

class ProductList {
    public int qty;
    public String name;
    public float price;

    @Override
    public String toString() {
        return "ProductList{" +
                "qty=" + qty +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public ProductList(int qty, String name, float price) {
        this.qty = qty;
        this.name = name;
        this.price = price;
    }
}
