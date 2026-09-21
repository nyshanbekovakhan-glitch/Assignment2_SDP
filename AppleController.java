package abstractfactory;

public class AppleController implements Controller {
    @Override
    public void control() {
        System.out.println("Apple Controller controls smart devices.");
    }
}