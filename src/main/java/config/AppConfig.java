package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.Bus;
import pojo.Car;
import pojo.Driver;
import pojo.Pickup;

@Configuration
public class AppConfig {

    @Bean
    public Car getCarBean(){
        return new Car("carModel");
    }
    @Bean
    public Bus getBusBean(){
        return new Bus("busModel");
    }
    @Bean
    public Pickup getPickupBean(){
        return new Pickup("pickupModel");
    }

    @Bean(name = "carDriver")
    public Driver getCarDriver(){
        return new Driver("Василий", getCarBean());
    }
    @Bean(name = "busDriver")
    public Driver getBusDriver(){
        return new Driver("Пётр", getBusBean());
    }
    @Bean(name = "pickupDriver")
    public Driver getPickupDriver(){
        return new Driver("Онуфрий", getPickupBean());
    }
}
