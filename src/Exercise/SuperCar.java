package Exercise;

public class SuperCar {
    private String CarBrand;
    private String CarColor;
    private int CarEngineSize;
    private int MaxSpeed;
    private String CountryOfOrigin;
    public SuperCar(){}

    public SuperCar(String n,String c,int ces,int ms,String coo){
        CarBrand = n;
        CarColor = c;
        CarEngineSize = ces;
        MaxSpeed = ms;
        CountryOfOrigin = coo;
    }

    public String getCarBrand (){
        return CarBrand;
    }
    public void setCarBrand(String n){
        CarBrand = n;
    }
    public String getCarColor(){
        return CarColor;
    }
    public void setCarColor(String c) {
        CarColor = c;
    }
    public int getCarEngineSize(){
        return CarEngineSize;
    }
    public  void setCarEngineSize(int ces){
        CarEngineSize = ces;
    }
    public int getMaxSpeed(){
        return MaxSpeed;
    }
    public  void setMaxSpeed(int ms){
        MaxSpeed = ms;
    }
    public String getCountryOfOrigin(){
        return CountryOfOrigin;
    }
    public void setCountryOfOrigin(String coo) {
        CountryOfOrigin = coo;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "CarBrand='" + CarBrand + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarEngineSize=" + CarEngineSize +
                ", MaxSpeed=" + MaxSpeed +
                ", CountryOfOrigin='" + CountryOfOrigin + '\'' +
                '}';
    }
}