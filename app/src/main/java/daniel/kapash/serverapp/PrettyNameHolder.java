package daniel.kapash.serverapp;

import com.google.gson.annotations.SerializedName;

public class PrettyNameHolder {
    @SerializedName("pretty_name")
    private String prettyName;

    public PrettyNameHolder(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getPrettyName() {
        return prettyName;
    }
}
