package exercises.technology;

public class Computer {

    private int releaseDate;
    private String brand;
    private String model;
    private int storage;
    private boolean hasDisplay;

    public Computer(int releaseDate, String brand, String model, int storage, boolean hasDisplay) {
        this.releaseDate = releaseDate;
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.hasDisplay = hasDisplay;
    }

    public Computer(int releaseDate, String brand, String model, int storage) {
        this.releaseDate = releaseDate;
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    public Computer() {}

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void increaseStorage(int aStorage) {
        this.storage = this.storage + aStorage;
    }

    public void addDisplay() {
        if(!this.hasDisplay) {
            this.hasDisplay = true;
        }
    }


}
