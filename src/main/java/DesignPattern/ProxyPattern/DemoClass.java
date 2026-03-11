package DesignPattern.ProxyPattern;

public class DemoClass {
    public static void main(String[] args) {
        Image object = new ProxyImage("101_img.jpg");
        object.display("101_img");
    }
}
