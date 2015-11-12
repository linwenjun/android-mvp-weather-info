package thoughtworks.academy.androidmvpweatherinfo.presenter;

import thoughtworks.academy.androidmvpweatherinfo.model.IWeatherModel;
import thoughtworks.academy.androidmvpweatherinfo.model.Weather;
import thoughtworks.academy.androidmvpweatherinfo.model.WeatherModel;
import thoughtworks.academy.androidmvpweatherinfo.view.IWeatherView;

public class WeatherPresenter implements IWeatherPresenter, IOnWeatherListener {

    private IWeatherModel weatherModel;
    private IWeatherView weatherView;

    public WeatherPresenter(IWeatherView weatherView) {
        this.weatherView = weatherView;
        this.weatherModel = new WeatherModel();
    }

    @Override
    public void getWeather(String cityId) {
        weatherView.showLoading();
        weatherModel.getWeather(cityId, this);
    }

    @Override
    public void onSuccess(Weather weather) {
        weatherView.hideLoading();
        weatherView.setWeatherInfo(weather);
    }

    @Override
    public void onError() {
        weatherView.hideLoading();
        weatherView.showError();
    }
}
