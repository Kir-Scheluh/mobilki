package com.mirea.schelukhinka.mybuttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView textViewStudent;
    private Button btnWhoAmI;
    private  Button btnItsNotMe;
    private CheckBox checkBox;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnItsNotMe = findViewById(R.id.btnItIsNotMe);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        checkBox = findViewById(R.id.checkBox);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер в списке № 27");
                checkBox.setChecked(true);
            }
        };

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

    }
    public  void onClickItsNotMe(View view){
        textViewStudent.setText("Это не я сделал");
        checkBox.setChecked(false);
    }


}