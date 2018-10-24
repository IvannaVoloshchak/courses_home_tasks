package inner_nested_classes.task1;

import java.util.List;

public class Airplane {
    private List<AirPlaneEngine> airplaneEngine;

    @Override
    public String toString() {
        return "Airplane{" +
                airplaneEngine +
                '}';
    }

    public Airplane(List<AirPlaneEngine> airplaneEngine) {
        this.airplaneEngine = airplaneEngine;
    }


    public class AirPlaneEngine implements IEngine {
        private Engine engine;

        public AirPlaneEngine(double engineSize, Fuel fuel, int cylinders) {
            engine = new Engine();
            engine.engineSize = engineSize;
            engine.fuel = fuel;
            engine.cylinders = cylinders;
        }

        public boolean turnOff() {
            engine.isTurnOn = false;
            return engine.isTurnOn;
        }

        public boolean turnOn() {
            engine.isTurnOn = true;
            return engine.isTurnOn;
        }

        @Override
        public String toString() {
            return "AirPlaneEngine{" +
                    engine +
                    '}';
        }

        class Engine {
            private Double engineSize;
            private boolean isTurnOn = false;
            private Fuel fuel;
            private int cylinders;

            @Override
            public String toString() {
                return "Engine{" +
                        "engineSize=" + engineSize +
                        ", isTurnOn=" + isTurnOn +
                        ", fuel=" + fuel +
                        ", cylinders=" + cylinders +
                        '}';
            }
        }
    }
}
