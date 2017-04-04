package kr.hs.e_mirim.lisa1129.friendsimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firsthabbit = (Button)findViewById(R.id.firsthabbit);
        Button secondhabbit = (Button)findViewById(R.id.secondhabbit);
        Button thirdhabbit = (Button)findViewById(R.id.thirdhabbit);
        Button fourthhabbit = (Button)findViewById(R.id.fourthhabbit);
        Button fifthhabbit = (Button)findViewById(R.id.fifthhabbit);
        firsthabbit.setOnClickListener(this);
        secondhabbit.setOnClickListener(this);
        thirdhabbit.setOnClickListener(this);
        fourthhabbit.setOnClickListener(this);
        fifthhabbit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "엥?", Toast.LENGTH_LONG).show();
    }
}
