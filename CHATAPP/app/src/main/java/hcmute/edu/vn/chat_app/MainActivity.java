package hcmute.edu.vn.chat_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // logout of Chatting
        imgLogout = findViewById(R.id.img_logout);

        imgLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutChat();
            }
        });
    }

    public void logoutChat() {
        // Need add a dialog to confirm if the user wants to logout of the apps

        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_layout_logout);
        Button btnNo, btnYes;
        btnYes = dialog.findViewById(R.id.btn_yes);
        btnNo = dialog.findViewById(R.id.btn_no);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // need auth by firebase
                //FirebaseAuth.getInstance().signOut();
                Log.e("LogOut:", "Successfully");
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("LogOut:", "Still at Chat App");
                dialog.dismiss();
            }
        });
        dialog.show();



    }


}