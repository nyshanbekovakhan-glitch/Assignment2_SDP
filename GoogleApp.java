package abstractfactory;
public class GoogleApp implements SmartApp {
    @Override
    public void connect() {
        System.out.println("Google Home App connects to the smart home.");
    }
}
