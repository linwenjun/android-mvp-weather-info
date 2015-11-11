package thoughtworks.academy.androidmvpweatherinfo.model;
package thoughtworks.academy.androidmvpweatherinfo.presenter;

public interface IWeatherModel {
    void getWeather(String cityId, IOnWeatherListener listener)
}
