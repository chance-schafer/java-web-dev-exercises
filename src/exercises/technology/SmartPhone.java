package exercises.technology;

public class SmartPhone extends Computer {

    private boolean foldable;
    private int numOfSelfies;

    public SmartPhone(int releaseDate, String brand, String model, int storage, boolean foldable) {
        super(releaseDate, brand, model, storage);
        this.foldable = foldable;
    }

    public void takeSelfie() {
        this.numOfSelfies += 1;
    }

    public void deleteLastSelfie() {
        this.numOfSelfies -= 1;
    }

    public int getNumOfSelfies() {
        return this.numOfSelfies;
    }

}
