package abstractfactory;
public class GoogleHomeFactory implements SmartHomeFactory {
    @Override
    public Sensor createSensor() {
        return new GoogleSensor();
    }
    @Override
    public Controller createController() {
        return new GoogleController();
    }
    @Override
    public SmartApp createApp() {
        return new GoogleApp();
    }
}