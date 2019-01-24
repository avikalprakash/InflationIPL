package patna.bihar.inflaction.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import patna.bihar.inflaction.MainActivity;
import patna.bihar.inflaction.R;

public class FiveStepActivity extends AppCompatActivity {
    TextView tvheadertitle;
    ImageView back;
    Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_step);
        tvheadertitle=(TextView)findViewById(R.id.tvheadertitle);
        tvheadertitle.setText("Payment Details");
        back = (ImageView)findViewById(R.id.ivheaderleft);
        submitBtn = findViewById(R.id.submit);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
