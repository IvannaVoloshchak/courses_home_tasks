package inner_nested_classes.Task1;

import java.util.ArrayList;

class RunProgram {
    public static void main(String[] args) {

        var airPlaneEngins= new ArrayList<Airplane.AirPlaneEngine>();
        var airplaneEngin1= new Airplane(airPlaneEngins).new AirPlaneEngine(2.0, Fuel.GAS, 4);
        airplaneEngin1.turnOn();
        airPlaneEngins.add(airplaneEngin1);
        var airplane = new Airplane(airPlaneEngins);
        System.out.println(airplane);
    }
}
