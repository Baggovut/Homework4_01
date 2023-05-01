import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Driver;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("carDriver",Driver.class);
        driver1.startTheCar();

        Driver driver2 = context.getBean("busDriver",Driver.class);
        driver2.startTheCar();

        Driver driver3 = context.getBean("pickupDriver",Driver.class);
        driver3.startTheCar();
    }
}
