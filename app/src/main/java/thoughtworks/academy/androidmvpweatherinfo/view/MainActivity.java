package thoughtworks.academy.androidmvpweatherinfo.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import thoughtworks.academy.androidmvpweatherinfo.R;
import thoughtworks.academy.androidmvpweatherinfo.model.Weather;
import thoughtworks.academy.androidmvpweatherinfo.model.WeatherInfo;
import thoughtworks.academy.androidmvpweatherinfo.presenter.WeatherPresenter;


public class MainActivity extends Activity implements IWeatherView, View.OnClickListener {

    private WeatherPresenter weatherPresenter;
    private Button btnOk;
    private EditText textCityId;
    private TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherPresenter = new WeatherPresenter(this);

        btnOk = (Button) findViewById(R.id.button_ok);
        textCityId = (EditText) findViewById(R.id.city_id);
        textInfo = (TextView) findViewById(R.id.text_info);

        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_ok:
                weatherPresenter.getWeather(textCityId.getText().toString());
                break;
            default:
                break;
        }
    }

    @Override
    public void showLoading() {
        textInfo.setText("Loading...");
    }

    @Override
    public void hideLoading() {
        textInfo.setText("Loaded");
    }

    @Override
    public void showError() {
        textInfo.setText("Error");
    }

    @Override
    public void setWeatherInfo(Weather weather) {
        WeatherInfo weatherInfo = weather.getWeatherinfo();
        textInfo.setText(weatherInfo.getCity() + ":" + weatherInfo.getWD());
    }
}
