// Accessing Car class from another file 
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M3 GTR", "Matt Marine Blue" );
        Car car2 = new Car("Audi", "R8 V8 GTS", "Audi Official Racing White" );
        Car car3 = new Car("Porsche", "911 GT3 RS", "Porsche Official Blue and Red" );
        byte count = 1;
        System.out.println("Pol Positions");
        System.out.println("P"+(count++)+". "+car1.manufacturer+" "+car1.model+" ("+car1.color+")");
        System.out.println("P"+(count++)+". "+car2.manufacturer+" "+car2.model+" ("+car2.color+")");
        System.out.println("P"+(count++)+". "+car3.manufacturer+" "+car3.model+" ("+car3.color+")");
    }
}
