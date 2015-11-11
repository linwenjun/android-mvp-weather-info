package thoughtworks.academy.androidmvpweatherinfo.view;

import thoughtworks.academy.androidmvpweatherinfo.model.Weather;

public interface IWeatherView {
    void showLoading();
    void hideLoading();
    void showError();
    void setWeatherInfo(Weather weather);
}
