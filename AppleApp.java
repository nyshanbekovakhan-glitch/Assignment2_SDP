package abstractfactory;
public class AppleApp implements SmartApp {
    @Override
    public void connect() {
        System.out.println("Apple Home App connects to the smart home.");
    }
}
