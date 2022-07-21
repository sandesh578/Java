package innerClass;

class Vehicle {

    private String name;

    public Vehicle(String name)
    {
       this.name=name; 
    }
    class Engine {

        int horsePower;
        public Engine(int horsePower)
        {
            this.horsePower=horsePower;
        }
        void start() {
            System.out.println("RRRrrrrrrr....");
        }

        public void printHorsePower()
        {
            System.out.println("Vehicle "+name+" has "+horsePower+" horsepower.");
        }
    }
}


public class VehicleEngine {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Engine engine = vehicle.new Engine(15);
        engine.printHorsePower();
    }
}
