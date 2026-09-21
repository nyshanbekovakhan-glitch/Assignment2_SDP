package factorymethod;

public class SmartLamp implements Device {

    @Override
    public void install() {
        System.out.println("Smart Lamp is installed.");
    }
}