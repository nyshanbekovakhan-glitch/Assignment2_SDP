package factorymethod;

public class SmartCamera implements Device {

    @Override
    public void install() {
        System.out.println("Smart Camera is installed.");
    }
}
