package guided3.stringextra.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class DisplayNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra("InputanAngka");

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Angka yang anda inputkan adalah "+ message);

        setContentView(textView);
    }
}