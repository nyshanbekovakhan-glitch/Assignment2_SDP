package factorymethod;

public class SmartThermostat implements Device {

    @Override
    public void install() {
        System.out.println("Smart Thermostat is installed.");
    }
}