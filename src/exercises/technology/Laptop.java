package exercises.technology;

public class Laptop extends Computer {

    private double weight;

    public Laptop(int releaseDate, String brand, String model, int storage, double weight) {
        super(releaseDate, brand, model, storage);
        this.weight = weight;
    }

    public String isPortable() {
        if(weight < 5) {
            return "Laptop is super portable and lightweight";
        } else {
            return "Not meant for carrying long distances";
        }
    }
}
