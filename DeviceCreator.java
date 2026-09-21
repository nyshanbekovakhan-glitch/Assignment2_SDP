package factorymethod;

public abstract class DeviceCreator {

    public abstract Device createDevice();

    public void installDevice() {
        Device device = createDevice();
        device.install();
    }
}