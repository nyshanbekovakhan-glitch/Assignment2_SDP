package factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DeviceCreator lampCreator = new LampCreator();
        lampCreator.installDevice();
        DeviceCreator thermostatCreator = new ThermostatCreator();
        thermostatCreator.installDevice();
        DeviceCreator cameraCreator = new CameraCreator();
        cameraCreator.installDevice();
    }
}