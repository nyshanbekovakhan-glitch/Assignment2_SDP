package abstractfactory;

public class AppleHomeFactory implements SmartHomeFactory {
    @Override
    public Sensor createSensor() {
        return new AppleSensor();
    }
    @Override
    public Controller createController() {
        return new AppleController();
    }
    @Override
    public SmartApp createApp() {
        return new AppleApp();
    }
}
