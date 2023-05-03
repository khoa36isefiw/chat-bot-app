package hcmute.edu.vn.chat_app;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    TextView txtSignUp;
    Button btnLoginPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtSignUp = findViewById(R.id.txt_SignUp);
        btnLoginPage = findViewById(R.id.btn_login);

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Move to: ", "Sign Up Account");
                callActivity(RegisterActivity.class);
            }
        });

        // Login Successfully, but not check input of user JUST GUI

        btnLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Move to: ", "App Chat");
                //callActivity(MainActivity.class);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                //intent.putExtra("key", "value"); // Truyền thông tin "value" với key là "key"
                startActivity(intent);
            }
        });
    }


    //activityClass là biến đại diện cho Class<?>
    // của Activity mà ta muốn khởi chạy.
    public void callActivity(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        intent.putExtra("key", "value"); // Truyền thông tin "value" với key là "key"
        startActivity(intent);
    }

}
