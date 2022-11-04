package etc;

public class Location {

    private String city;
    private int lat; //위도
    private int lon; //경도

    public Location(String city, int lat, int lon) {
        this.city = city;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    

    
    
}
