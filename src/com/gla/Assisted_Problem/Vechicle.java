package Assisted_Problem;
class Vehicle{
    int maxSpeed;String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Speed:"+maxSpeed+" Fuel:"+fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);this.seatCapacity=seatCapacity;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seats:"+seatCapacity);
    }
}
class Truck extends Vehicle{
    int loadCapacity;
    Truck(int maxSpeed,String fuelType,int loadCapacity){
        super(maxSpeed,fuelType);this.loadCapacity=loadCapacity;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Load:"+loadCapacity);
    }
}
class Motorcycle extends Vehicle{
    int mileage;
    Motorcycle(int maxSpeed,String fuelType,int mileage){
        super(maxSpeed,fuelType);this.mileage=mileage;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Mileage:"+mileage);
    }
}
class VEHICLE{
    public static void main(String[] args){
        Vehicle[] v={
                new Car(180,"Petrol",5),
                new Truck(120,"Diesel",1000),
                new Motorcycle(150,"Petrol",40)
        };
        for(Vehicle x:v){x.displayInfo();}
    }
}
