package daniel.kapash.serverapp;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("username")
    private String userName;

    private String pretty_name;
    private String image_url;

    public String getUserName() {
        return userName;
    }

    public String getPretty_name() {
        return pretty_name;
    }

    public String getImage_url() {
        return image_url;
    }
}
