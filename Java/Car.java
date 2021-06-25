class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passanger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCar(){
        if(passanger != null)
            System.out.println("License: " + license + " Driver: " + driver.name + " Passangers: " + passanger);

    }

    public Integer getPassanger(){
        return passanger;
    }

    public void setPassanger(Integer passanger){
        if(passanger == 4)
            this.passanger = passanger;
        else
            System.out.println("Necesitas asignar 4 pasageros");
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public Account getDriver() {
        return driver;
    }
    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
