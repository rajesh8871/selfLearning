package DesignPattern.Builder;

public class PhoneBuilder {

    private String phoneName;
    private String phoneModel;
    private double screenSize;
    private double price;
    private String phoneWarranty;

    public PhoneBuilder setPhoneName(String phoneName) {
        this.phoneName = phoneName;
        return this;
    }

    public PhoneBuilder setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setPhoneWarranty(String phoneWarranty) {
        this.phoneWarranty = phoneWarranty;
        return this;
    }

    public Phone build() {
        return new Phone(phoneName, phoneModel, screenSize, price, phoneModel);
    }
}
