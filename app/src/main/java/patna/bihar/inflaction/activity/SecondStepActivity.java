package patna.bihar.inflaction.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import patna.bihar.inflaction.R;

public class SecondStepActivity extends AppCompatActivity {
    TextView tvheadertitle;
    ImageView back;
    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_step);
        tvheadertitle=(TextView)findViewById(R.id.tvheadertitle);
        tvheadertitle.setText("Nominee Details");
        back = (ImageView)findViewById(R.id.ivheaderleft);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        nextBtn=findViewById(R.id.next);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ThirdStepActivity.class);
                startActivity(i);
            }
        });
    }
}
