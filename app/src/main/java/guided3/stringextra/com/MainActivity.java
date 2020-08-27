package guided3.stringextra.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessage.class);
        String message = "";
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int rbc = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(rbc);
        message = radioButton.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendNumberMessage(View view){
        Intent intent = new Intent(this, DisplayNumber.class);
        EditText number = (EditText) findViewById(R.id.textNumber);
        int angka = Integer.valueOf(number.getText().toString());

        intent.putExtra("inputanAngka", String.valueOf(angka));
        startActivity(intent);
    }
}