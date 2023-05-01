package pojo;

public abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public void start(){
        System.out.println("<"+this.getClass().getName()+"> модели "+getModel()+" готов к работе");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "pojo.Transport{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
