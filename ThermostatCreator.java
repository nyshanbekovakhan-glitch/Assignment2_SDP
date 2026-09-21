package factorymethod;

public class ThermostatCreator extends DeviceCreator {

    @Override
    public Device createDevice() {
        return new SmartThermostat();
    }
}