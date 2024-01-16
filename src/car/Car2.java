public class Car2 {
    private String make;
    private String model;
    private int year;

    public Car2() {
        this.make = "Nepoznato";
        this.model = "Nepoznato";
        this.year = 2015;
    }

    public Car2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Car - kola=" + make + ", model=" + model + ", godina=" + year + "]";
    }
}
