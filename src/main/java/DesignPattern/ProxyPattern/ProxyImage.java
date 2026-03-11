package DesignPattern.ProxyPattern;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    @Override
    public void display(String imageName) {
        System.out.println("");
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display(imageName);
    }

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


}
