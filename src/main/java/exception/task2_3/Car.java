package exception.task2_3;

import org.apache.log4j.Logger;

public class Car {
    private static final Logger filelogger = Logger.getLogger("FILELOGGER");

    public void methodWithThrows() throws NullPointerException {
        String value = null;
        value.toLowerCase();
    }

    public void methodWithTry(String value) {
        try {
            value.toLowerCase();
        } catch (NullPointerException e) {
            filelogger.error("Make your value not null ");
        } finally {
            filelogger.info("The exception object was intercepted");
        }
    }

    public void methodWithTry() {
        try {
            methodWithThrows();
        } catch (NullPointerException e) {
            filelogger.error("Make your value not null ");
        } finally {
            filelogger.info("The exception object was intercepted");
        }
    }

    public void tryAndSkipFinally(String value) {
        try {
            value.toLowerCase();
        } catch (NullPointerException e) {
            filelogger.error("Make your value not null ");
            filelogger.info("Block finally will not work");
            System.exit(0);
        } finally {
            filelogger.info("The exception object was intercepted");
        }
    }
}
