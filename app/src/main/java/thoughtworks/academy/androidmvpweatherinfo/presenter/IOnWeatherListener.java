package thoughtworks.academy.androidmvpweatherinfo.presenter;

import thoughtworks.academy.androidmvpweatherinfo.model.Weather;

public interface IOnWeatherListener {

  public void onSuccess(Weather weather);

  public void onError();
}
