class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passanger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name + " Passangers: " + passanger);
    }

    public Integer getPassanger(){
        return passanger;
    }

    public void setPassanger(Integer passanger){
        this.passanger = passanger;
    }
}
