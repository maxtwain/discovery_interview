package com;

import java.util.ArrayList;
import java.util.List;

public class ShoeStore {
    private int totalNikeShoes;
    private int totalAdidasShoes;
    private final List<Shoe> shoesSold = new ArrayList<>();
    private final List<String> successfulSalespeople = new ArrayList<>();

    public ShoeStore(int totalNikeShoes, int totalAdidasShoes){
        this.totalNikeShoes = totalNikeShoes;
        this.totalAdidasShoes = totalAdidasShoes;
    }

    public int getTotalShoes() {
        return totalNikeShoes + totalAdidasShoes;
    }

    public void recordSale(Shoe[] shoes, String salesPersonName) {
        if (!successfulSalespeople.contains(salesPersonName)){
            successfulSalespeople.add(salesPersonName);
        }
        for(Shoe shoe: shoes) {
            if (shoe.getClass().getSimpleName().contains("Nike")) {
                totalNikeShoes--;
                shoesSold.add(shoe);
            } else if (shoe.getClass().getSimpleName().contains("Adidas")) {
                totalAdidasShoes--;
                shoesSold.add(shoe);
            }
        }
    }

    public void printAllShoesSold() {
        for (Shoe shoe: shoesSold) {
            System.out.println(shoe.getClass().getSimpleName() + " " + shoe.getColor());
        }
    }

    public void printNamesOfSuccessfulSalespeople() {
        for (String successFulSalesPerson: successfulSalespeople) {
            System.out.println(successFulSalesPerson);
        }
    }
}