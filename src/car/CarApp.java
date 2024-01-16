public class CarApp {
    public static void main(String[] args) {
        Car2 defaultCar = new Car2();
        Car2 mojaCar = new Car2("Citroen", "C4", 2016);
        System.out.println("Default kola : " + defaultCar);
        System.out.println("Odbrana kola :  " + mojaCar);
    }
}
