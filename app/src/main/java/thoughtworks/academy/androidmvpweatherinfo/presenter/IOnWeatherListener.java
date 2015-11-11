package thoughtworks.academy.androidmvpweatherinfo.presenter;

public interface IOnWeatherListener {

  public void onSuccess(Weather weather);

  public void onError();
}
