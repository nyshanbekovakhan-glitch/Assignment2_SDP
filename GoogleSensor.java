package abstractfactory;
public class GoogleSensor implements Sensor {
    @Override
    public void detect() {
        System.out.println("Google Sensor detects activity.");
    }
}
