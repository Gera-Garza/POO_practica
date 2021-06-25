from account import Account
from car import Car

if __name__ == "__main__":
    print("hola mundo")
    
    car = Car("AMS123", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("AMS456", Account("Maria Sofia", "ANDA123"))
    print(vars(car2))
    print(vars(car2.driver))