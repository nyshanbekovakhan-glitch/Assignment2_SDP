package abstractfactory;
public class GoogleController implements Controller {
    @Override
    public void control() {
        System.out.println("Google Controller controls smart devices.");
    }
}