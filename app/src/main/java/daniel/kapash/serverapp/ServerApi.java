package daniel.kapash.serverapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerApi {

    @GET("/")
    Call<ConnectionResponse> checkConnection();

    
}
