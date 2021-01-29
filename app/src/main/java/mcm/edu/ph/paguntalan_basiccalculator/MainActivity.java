package mcm.edu.ph.paguntalan_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonadd, buttonmin, buttondiv, buttonmul, buttonmod;
        EditText  edittext1, edittext2;
        TextView textresult;

        buttonadd = findViewById(R.id.buttonadd);
        buttonmin = findViewById(R.id.buttonmin);
        buttondiv = findViewById(R.id.buttondiv);
        buttonmul = findViewById(R.id.buttonmul);
        buttonmod = findViewById(R.id.buttonmod);

        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);

        textresult = findViewById(R.id.textresult);

        buttonadd.setOnClickListener(this);
        buttonmin.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttonmod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText edittext1, edittext2;
        TextView textresult;

        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);
        textresult = findViewById(R.id.textresult);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(edittext1.getText().toString());
        op2 = Double.parseDouble(edittext2.getText().toString());

        switch (v.getId()) {
            case R.id.buttonadd:
                answer = op1 + op2;
                textresult.setText(Double.toString(answer));

                break;
            case R.id.buttonmin:
                answer = op1 - op2;
                textresult.setText(Double.toString(answer));

                break;
            case R.id.buttonmul:
                answer = op1 * op2;
                textresult.setText(Double.toString(answer));

                break;
            case R.id.buttondiv:
                answer = op1 / op2;
                textresult.setText(Double.toString(answer));
                break;

            case R.id.buttonmod:
                answer = op1 % op2;
                textresult.setText(Double.toString(answer));
                break;
        }
    }
}