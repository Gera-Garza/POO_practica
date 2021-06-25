class Main{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("AMQ123",new Account("Andres Herrera", "AND123"));
        car.passanger=4;
        car.printDataCar();

        Car car2 = new Car("AMQ456",new Account("Maria Garcia", "AND456"));
        car2.passanger=2;
        car2.printDataCar();
    }
}
 