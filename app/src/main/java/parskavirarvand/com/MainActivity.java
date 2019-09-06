package parskavirarvand.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static parskavirarvand.com.R.drawable.wr;

public class MainActivity extends AppCompatActivity {

    ImageView img_wr;
    ImageView img_wl;
    Random rnd;
    Integer temp = 0;
    TextView txt_score;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_wr = findViewById(R.id.img_wr);
        img_wl = findViewById(R.id.img_wl);
        txt_score = findViewById(R.id.txt_score);


    }


    public void onclick_r (View v){
        img_wr.setImageResource(R.drawable.wr);
        img_wl.setImageResource(R.drawable.empty);
        temp = temp + 1;
        rnd = new Random();
        n = rnd.nextInt(2);
        txt_score.setText(temp.toString()+ n);
    }

    public void onclick_l (View v){
        img_wl.setImageResource(R.drawable.wl);
        img_wr.setImageResource(R.drawable.empty);
        temp = temp + 1;
        txt_score.setText(temp.toString());
    }

}
