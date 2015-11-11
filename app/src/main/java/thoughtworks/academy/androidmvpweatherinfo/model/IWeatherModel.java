package thoughtworks.academy.androidmvpweatherinfo.model;

import thoughtworks.academy.androidmvpweatherinfo.presenter.IOnWeatherListener;

public interface IWeatherModel {
    void getWeather(String cityId, IOnWeatherListener listener);
}
