package web.models;

public class Car {

    private String brand;
    private String model;
    private int volume;

    public Car() {

    }

    public Car(String brand, String model, int volume) {

        this.brand = brand;
        this.model = model;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
