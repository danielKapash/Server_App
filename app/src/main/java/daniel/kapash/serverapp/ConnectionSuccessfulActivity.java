package daniel.kapash.serverapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ConnectionSuccessfulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_successful);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                checkUserName();
            }
        }, 2000);

    }

    private void checkUserName() {
        finish();
        String userName = ((MyApp)getApplicationContext()).getUserName();
        if (userName == null || userName.equals("")) {
            Intent intent = new Intent(this, EnterUserNameActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, LoadUserInfoActivity.class);
            startActivity(intent);
        }
    }
}
