package pojo;

public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void startTheCar() {
        System.out.println(name + " сел в " + transport.getModel());
        transport.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + getName() + '\'' +
                ", transport=" + getTransport() +
                '}';
    }
}
