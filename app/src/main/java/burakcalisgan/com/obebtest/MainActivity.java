package burakcalisgan.com.obebtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText sayi1, sayi2, result;
    Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi1  = findViewById(R.id.sayi1);
        sayi2  = findViewById(R.id.sayi2);
        result  = findViewById(R.id.result);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = Integer.parseInt(sayi1.getText().toString());
                int s2 = Integer.parseInt(sayi2.getText().toString());
                int resultTemp = 0;
                if (s1 == s2){
                    result.setText(String.valueOf(s1));
                }
                else {
                    while (s1 != s2) {
                        if (s1 > s2) {
                            s1 = s1 - s2;
                            resultTemp = s1;
                        } else {
                            s2 = s2 - s1;
                            resultTemp = s2;
                        }

                    }
                    result.setText(String.valueOf(resultTemp));
                }
            }
        });
    }

}
