package ru.samsung.itschool.book.equation243;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    private double dDis = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализирует Активность.
        setContentView(R.layout.activity_main);
    }

    public void solveEquation(View view) {
        double a = Double.parseDouble( ((EditText)
                findViewById(R.id.coefficient_a)).getText().toString());
        double b = Double.parseDouble( ((EditText)
                findViewById(R.id.coefficient_b)).getText().toString());
        double c = Double.parseDouble( ((EditText)
                findViewById(R.id.coefficient_c)).getText().toString());
        TextView result = (TextView) findViewById(R.id.result);
        dDis = pow(b, 2) - 4*a*c;
        if (dDis < 0) {
            result.setText("Корней нет");
        }
        if(dDis == 0){
            result.setText("" + String.valueOf(-(b/2*a)));
        }
        if(dDis > 0){
            result.setText("" + String.valueOf(((-b) + sqrt(dDis)) / (2 * a)) + " и " + String.valueOf(((-b) - sqrt(dDis)) / (2 * a)));
        }
    }
}
