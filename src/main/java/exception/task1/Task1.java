package exception.task1;

import org.apache.log4j.Logger;

public class Task1 {
    private static final Logger filelogger = Logger.getLogger("FILELOGGER");

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane = null;
        try {
            airplane.fly();
        } catch (NullPointerException e) {
            filelogger.error("Make your object not null ");
        }
    }
}