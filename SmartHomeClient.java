package abstractfactory;

public class SmartHomeClient {
    private final SmartHomeFactory factory;
    public SmartHomeClient(SmartHomeFactory factory) {
        this.factory = factory;
    }
    public void setupHome() {
        Sensor sensor = factory.createSensor();
        Controller controller = factory.createController();
        SmartApp app = factory.createApp();
        sensor.detect();
        controller.control();
        app.connect();
    }
}
