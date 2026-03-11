package DesignPattern.Builder;

public class ShopDemo {
    public static void main(String[] args) {
        Phone phoneBuilder = new PhoneBuilder().setPhoneName("nokia").setPhoneModel("c200")
                .setPhoneWarranty("1Yr").setPrice(2100.00).build();
        //whatever field we will not set will be set to default value
        System.out.println(phoneBuilder);
    }
}
