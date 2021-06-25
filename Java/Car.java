class Car {
    Integer id;
    String license;
    Account driver;
    Integer passanger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
<<<<<<< HEAD
=======

>>>>>>> java
    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name);
    }
}
