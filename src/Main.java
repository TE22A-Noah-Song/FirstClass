public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       Car theToyota = new Car();

       theToyota.brand = "Toyota";
       theToyota.speed = 150;
        System.out.println("The "+theToyota.brand+" has speed "+theToyota.speed);

        Car bil2 = new Car();
        bil2.brand = "Izuzu";
        bil2.speed = 2;

        System.out.println("The "+bil2.brand+" has speed "+bil2.speed);

        bil2.speed = bil2.speed + 10;

        System.out.println("the "+bil2.brand+" now has speed "+bil2.speed);

    }
}