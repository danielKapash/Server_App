package daniel.kapash.serverapp;

import com.google.gson.annotations.SerializedName;

public class ImageUrlHolder {

    @SerializedName("image_url")
    private String imageUrl;

    public ImageUrlHolder(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
