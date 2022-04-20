package application.DataClasses;

public class Course {
    private String id;
    private int price;
    private int month;
    private String time;
    private String name;
    private int capacity=4;

    public Course() {
    }

    public Course(String id, int price, int month, String name, String time) {
        this.time = time;
        this.id = id;
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


}
