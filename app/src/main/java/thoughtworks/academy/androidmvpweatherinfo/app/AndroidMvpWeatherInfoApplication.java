package thoughtworks.academy.androidmvpweatherinfo.app;

import android.app.Application;

import thoughtworks.academy.androidmvpweatherinfo.util.VolleyRequest;

public class AndroidMvpWeatherInfoApplication extends Application {

    private static AndroidMvpWeatherInfoApplication instance;

    public AndroidMvpWeatherInfoApplication() {
        instance = this;
    }

    public static Application getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        VolleyRequest.buildRequestQueue(this);
    }
}
