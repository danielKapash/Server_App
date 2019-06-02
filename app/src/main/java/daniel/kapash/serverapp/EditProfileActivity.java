package daniel.kapash.serverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        ImageView octopusView = findViewById(R.id.octopus_image_view);
        ImageView crabView = findViewById(R.id.crab_image_view);
        ImageView alienView = findViewById(R.id.alien_image_view);
        ImageView frogView = findViewById(R.id.frog_image_view);
        ImageView robotView = findViewById(R.id.robot_image_view);
        ImageView unicornView = findViewById(R.id.unicorn_image_view);

        String base_url = "https://hujipostpc2019.pythonanywhere.com";

        Glide.with(this).load(base_url + "/images/octopus.png").into(octopusView);
        Glide.with(this).load(base_url + "/images/crab.png").into(crabView);
        Glide.with(this).load(base_url + "/images/alien.png").into(alienView);
        Glide.with(this).load(base_url + "/images/frog.png").into(frogView);
        Glide.with(this).load(base_url + "/images/robot.png").into(robotView);
        Glide.with(this).load(base_url + "/images/unicorn.png").into(unicornView);





    }
}
