
public class App {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println("Hello from app");
        App app = new App();
        app.setName("my_name");
        System.out.println(app.getName());

    }
}