package com.tom.exam;

public class ShopItem {
    String id;
    String name;
    int price;
    int QTY=1;
    float off=1;
    int num=1;
    public ShopItem(String id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public void print(){
        System.out.println(id+"\t"+name+"\t"+price+"\t"+QTY*num+"\t"+(price*off));
    }
}
