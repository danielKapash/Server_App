package daniel.kapash.serverapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface ServerApi {

    @GET("/")
    Call<ServerData> checkConnection();

    @GET("/users/{userName}/token")
    Call<ServerData> getUserToken(@Path("userName") String userName);

    @GET("user")
    Call<User> getUser(@Header("Authorization") String token);
}
