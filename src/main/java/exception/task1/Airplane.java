package exception.task1;

import org.apache.log4j.Logger;

public class Airplane {
    private static final Logger filelogger = Logger.getLogger("FILELOGGER");
    public void fly() {
        filelogger.info("Airplane can fly");
    }
}
