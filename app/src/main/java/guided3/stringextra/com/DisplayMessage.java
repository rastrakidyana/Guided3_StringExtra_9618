package guided3.stringextra.com;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.widget.TextView;

public class DisplayMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Anda memilih warna "+ message);

        if (message=="Merah"){
            textView.setTextColor(Color.parseColor("#FF0000"));
        }
        else if(message=="Hijau"){
            textView.setTextColor(Color.parseColor("#00FF00"));
        }
        else if(message=="Biru"){
            textView.setTextColor(Color.parseColor("#0000FF"));
        }
        setContentView(textView);
    }
}