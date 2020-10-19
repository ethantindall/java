package tindall;


import java.util.Map;

public class WeatherForecastItem {
    private int dt_txt;
    private Map<String, Float> main;
    private Map<String, String> weather;
    private String dt_txt;




    public Map<String, Float> getMain() {
        return main;
    }

    public void setMain(Map<String, Float> main) {
        this.main = main;
    }

    public Map<String, String> getWeather() {
        return weather;
    }

    public void setWeather(Map<String, String> weather) {
        this.weather = weather;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }
}
