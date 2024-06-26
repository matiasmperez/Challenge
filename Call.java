public class Call {
    private int duration;
    private String type;
    private String country;
    private String location;
    private String day;
    private int hour;

    // constructor
    public Call(int duration, String type, String country, String location, String day, int hour) {
        this.duration = duration;
        this.type = type;
        this.country = country;
        this.location = location;
        this.day = day;
        this.hour = hour;
    }

    public int getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }

    public String getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    // no se usan pero se definen.
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

}

// Tambien se podria haber resuelto con una herencia, es decir la clase padre
// call y los hijos de la herencia CallInternational para las llamadas
// internacionales que herede los datos de call pero a su vez agregue pais ya
// que es la unica que lo utiliza, y CallNational que agregue la localidad con
// la misma finalidad.