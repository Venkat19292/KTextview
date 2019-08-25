package master.mumbai.com.k_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private master.mumbai.com.ktextviewlibrary.KTextview custome_text;
    private EditText et_input;
    private Button button_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControll();
    }

    private void initControll() {
        custome_text=  findViewById(R.id.custom_text);
        et_input=  findViewById(R.id.et_input);
        button_convert= findViewById(R.id.button_convert);
        custome_text.setFormattedValue(10000L);

        button_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                custome_text.setFormattedValue(Long.valueOf(et_input.getText().toString()));
            }
        });
    }
}
