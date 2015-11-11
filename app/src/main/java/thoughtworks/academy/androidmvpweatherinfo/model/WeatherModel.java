package thoughtworks.academy.androidmvpweatherinfo.model;

import android.view.View;

import thoughtworks.academy.androidmvpweatherinfo.presenter.IOnWeatherListener;

public class WeatherModel implements IWeatherModel {

    private View view;

    public WeatherModel(View view) {
        this.view = view;
    }

    @Override
    public void getWeather(String cityId, IOnWeatherListener listener) {
//        Volley.Re
    }
}
