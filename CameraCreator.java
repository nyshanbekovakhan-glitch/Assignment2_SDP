package factorymethod;

public class CameraCreator extends DeviceCreator {

    @Override
    public Device createDevice() {
        return new SmartCamera();
    }
}