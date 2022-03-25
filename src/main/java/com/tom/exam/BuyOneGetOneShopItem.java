package com.tom.exam;

public class BuyOneGetOneShopItem extends ShopItem {
    public BuyOneGetOneShopItem(String id,String name,int price){
        super(id,name,price);
        num=2;
    }
    @Override
    public void print() {
        System.out.println(id+"\t"+name+"\t"+price+"\t"+QTY*num+"\t"+(price*off)+"\t"+"Buy one Get one");
    }
}
