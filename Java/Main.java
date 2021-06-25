class Main{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passanger = 4;
        //System.out.println("Car license: " + car.license);
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "AMQ456";
        car2.driver = "Maria Sofia Herrera";
        car2.passanger = 2;
        //System.out.println("Car license: " + car2.license);
        car2.printDataCar();
    }
}
 