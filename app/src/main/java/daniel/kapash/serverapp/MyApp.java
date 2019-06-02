package daniel.kapash.serverapp;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApp extends Application {

    ServerApi serverApi;

    private String userName;
    private SharedPreferences sharedPreferences;

    private static final String USER_NAME_KEY = "user name";

    @Override
    public void onCreate() {
        super.onCreate();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://hujipostpc2019.pythonanywhere.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        serverApi = retrofit.create(ServerApi.class);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        userName = sharedPreferences.getString(USER_NAME_KEY, "");

    }

    public String getUserName() {
        return userName;
    }

    void setUserName(String userName) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER_NAME_KEY, userName);
        editor.apply();
        this.userName = userName;
    }
}
