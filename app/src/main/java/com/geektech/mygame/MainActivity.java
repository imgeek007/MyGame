package com.geektech.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.geektech.mygame.signingboard.SigningActivity;

public class MainActivity extends AppCompatActivity {
    Button buttonStartGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean isSigned=false;
        if(!isSigned){
startActivity(new Intent(this, SigningActivity.class));
finish();
return;

        }
        setContentView(R.layout.activity_main);




        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void onChooseGameMode(View view) {
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
        buttonStartGame = view.findViewById(R.id.start_game);
        startActivity(intent);
    }
}
