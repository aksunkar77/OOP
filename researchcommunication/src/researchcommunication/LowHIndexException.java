package researchcommunication;

// Exception 1: h-index < 3 бол supervisor болгох үед
public class LowHIndexException extends Exception {
    public LowHIndexException(String supervisorName, int hIndex) {
        super("Cannot assign " + supervisorName + " as supervisor. " +
              "H-index is " + hIndex + ", but minimum required is 3.");
    }
}
