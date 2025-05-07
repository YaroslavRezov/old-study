public class SynergyJavaBook {
    String autor;
    String name;
    String yaer;
    String city;
    int value;
    SynergyJavaBook(String autor, String name, String yaer, String city, int value) {
        this.autor = autor;
        this.name = name;
        this.yaer = yaer;
        this.city = city;
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public String getAutor() {
        return autor;
    }
    public String getYear() {
        return yaer;
    }
    public String getCity() {
        return city;
    }
    public int getValue() {
        return value;
    }
    public void getEverything() {
        System.out.println(getAutor() + " "+ getName()+ " "+ getYear()+ " "+ getCity()+ " "+ getValue());

    }
}
