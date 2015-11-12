package thoughtworks.academy.androidmvpweatherinfo.model;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import thoughtworks.academy.androidmvpweatherinfo.presenter.IOnWeatherListener;
import thoughtworks.academy.androidmvpweatherinfo.util.VolleyRequest;

public class WeatherModel implements IWeatherModel {

    public WeatherModel() {}

    @Override
    public void getWeather(String cityId, final IOnWeatherListener listener) {
        VolleyRequest.newInstance().newGsonRequest("http://www.weather.com.cn/adat/sk/" + cityId + ".html",
                Weather.class, new Response.Listener<Weather>() {
                    @Override
                    public void onResponse(Weather weather) {
                        if(null != weather) {
                            listener.onSuccess(weather);
                        } else {
                            listener.onError();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError();
                    }
                });
    }
}
