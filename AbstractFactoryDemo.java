package abstractfactory;
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        SmartHomeFactory factory = new AppleHomeFactory();
        SmartHomeClient client = new SmartHomeClient(factory);
        client.setupHome();
    }
}
