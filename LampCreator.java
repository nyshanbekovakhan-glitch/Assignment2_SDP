package factorymethod;

public class LampCreator extends DeviceCreator {

    @Override
    public Device createDevice() {
        return new SmartLamp();
    }
}
