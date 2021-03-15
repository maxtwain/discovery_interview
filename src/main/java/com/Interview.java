package com;

public class Interview {
    public static void main(String[] args) {
        ShoeStore shoeStore = new ShoeStore(50, 50);

        Shoe[] firstBuyerBuys = new Shoe[] {
                new NikeShoe("blue"),
                new NikeShoe("red"),
                new AdidasShoe("blue")
        };
        shoeStore.recordSale(firstBuyerBuys, "Foo");
        Shoe[] secondBuyerBuys = new Shoe[] {
                new NikeShoe("black"),
                new AdidasShoe("black"),
        };
        shoeStore.recordSale(secondBuyerBuys, "Bar");
        System.out.println(shoeStore.getTotalShoes());
        shoeStore.printAllShoesSold();
        shoeStore.printNamesOfSuccessfulSalespeople();
    }
}
