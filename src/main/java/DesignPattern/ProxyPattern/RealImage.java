package DesignPattern.ProxyPattern;

public class RealImage implements Image {
    private String fileName;

    @Override
    public void display(String imageName) {
        System.out.println("");
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("file name: " + fileName);
    }
}
