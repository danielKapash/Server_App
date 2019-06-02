package daniel.kapash.serverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterUserNameActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_user_name);

        userNameEditText = findViewById(R.id.editText);
        saveButton = findViewById(R.id.button);

        saveButton.setEnabled(false);

        userNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() >= 1 && isNameLegal()) {
                    saveButton.setEnabled(true);
                } else {
                    saveButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameEditText.getText().toString();
                MyApp app = (MyApp) getApplicationContext();
                app.setUserName(userName);
                startLoadUserInfoActivity();
            }
        });
    }

    private boolean isNameLegal() {
        String userName = userNameEditText.getText().toString();
        for (char c : userName.toCharArray()) {
            if (!Character.isLetterOrDigit(c))
                return false;
        }
        return true;
    }

    private void startLoadUserInfoActivity() {
        finish();
        Intent intent = new Intent(this, ConnectionSuccessfulActivity.class);
        startActivity(intent);
    }


}
