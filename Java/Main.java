class Main{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        UberX uberX = new UberX("AMQ123",new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        //uberX.passanger = 4;
        uberX.setPassanger(4);
        uberX.printDataCar();

        /*Car car2 = new Car("AMQ456",new Account("Maria Garcia", "AND456"));
        car2.passanger=2;
        car2.printDataCar();*/
    }
}
 