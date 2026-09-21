package abstractfactory;

public interface SmartHomeFactory {
    Sensor createSensor();
    Controller createController();
    SmartApp createApp();
}