package com.yu.exam;

public class SalesShopItem extends ShopItem{
    int priceoff;
    public SalesShopItem(String id,String name,int price,int priceoff){
        super(id,name,price);
        this.priceoff=priceoff;
        off=8;
    }

    @Override
    public void print() {
        System.out.println(id+"\t"+name+"\t"+price+"\t"+QTY*num+"\t"+(price*off)/10+"\t"+"20%off");
    }
}
