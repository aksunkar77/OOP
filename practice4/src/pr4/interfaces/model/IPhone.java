package pr4.interfaces.model;

public class IPhone implements SellableAndPluggable {

    @Override
    public void sell() {
        System.out.println("iPhone is being sold");
    }

    @Override
    public void plug() {
        System.out.println("iPhone is charging");
    }
}