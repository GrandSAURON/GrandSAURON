/**-----------------------------------------------------------
 * CompanyName: SRC Solutions Ltd.(Mordor Corporation)
 * Copyright: Copyright © 2020-2021 by SRC Solutions Ltd.(Mordor Corporation)
 * Author: GrandSayron
 * Creation Date: 31.01.2021
 * Contents: functions for user activity
 -----------------------------------------------------------*/
package com.example.rasactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

/**----------------------------------------------------------------------------
                                    CLASSES
----------------------------------------------------------------------------*/
/**-----------------------------------------------------------
 * Author: GrandSayron
 * Creation Date: 31.01.2021
 * Comments: main activity class
 -----------------------------------------------------------*/
public class MainActivity extends AppCompatActivity {
    protected final String sLogin = "RAS";
    protected final String sPass = "1828";

    /**-----------------------------------------------------------
     * Author: GrandSayron
     * Creation Date: 31.01.2021
     * Comments: onCreate activity
     -----------------------------------------------------------*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnShort=(Button)findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String number = editText.getText().toString();

        TextView result = (TextView) findViewById(R.id.textView);
        btnShort.setOnClickListener(new View.OnClickListener(){

            /**-----------------------------------------------------------
             * Author: GrandSayron
             * Creation Date: 31.01.2021
             * Comments: button activity function
             -----------------------------------------------------------*/
            @Override
            public void onClick(View v){
                EditText editText = findViewById(R.id.editTextTextPersonName);
                String login = editText.getText().toString();
                EditText editText1 = findViewById(R.id.editTextTextPassword);
                String password = editText1.getText().toString();

                if(login.equals(sLogin) && password.equals(sPass)){
                    result.setTextColor(Color.GREEN);
                    result.setText("Верно");
                }else{
                    result.setTextColor(Color.RED);
                    result.setText("Вы ошиблись в логине или пароле");
                }
                editText.setText(null);
                editText1.setText(null);
            }
        });
    }
}