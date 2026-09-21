package abstractfactory;

public class AppleSensor implements Sensor {
    @Override
    public void detect(){
        System.out.println("Apple Sensor detects activity.");
    }

}
