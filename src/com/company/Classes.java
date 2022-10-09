package com.company;

public class Classes {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(IphoneModel.IPHONE_7, 200.60, false);

//        iphone.setModel("Iphone 7");
//        iphone.setPrice(450.70);
//        iphone.setWatherResistent(true);
//
//        System.out.println(iphone.getModel());
//        System.out.println(iphone.getPrice());
//        System.out.println(iphone.isWatherResistent());

        System.out.println(iphone);
        System.out.println(iphone.getModel().getModelSTR());
    }
}
