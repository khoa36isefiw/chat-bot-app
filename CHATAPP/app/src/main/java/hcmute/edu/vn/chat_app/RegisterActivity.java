package hcmute.edu.vn.chat_app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    TextView txtBackToLogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtBackToLogin = findViewById(R.id.txt_backToLogin);

        // trở về trang login
        txtBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                  RegisterActivity.this, "Back To Login Page", Toast.LENGTH_SHORT
                ).show();
                Log.e("Return to Login: ", "Successfully");
                finish(); // Finish the current activity and return to the previous one
            }
        });

    }
}
