package kr.hs.e_mirim.lisa1129.friendsimulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String TAG = "구지원:Main";
    private ImageView mImageViewFriendVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출");
        setContentView(R.layout.activity_main);

        mImageViewFriendVisual = (ImageView) findViewById(R.id.photo_01);
        Log.d(TAG, "activity_main 레이아웃 세팅");
    }

    public void onClick(View view) {
        Log.d(TAG, "onClick 메소드 호출");
        Log.d(TAG, "클릭된 뷰 id : " + view.getId());
        switch (view.getId()) {
            case R.id.firsthabbit:
                Log.d(TAG, "버튼1 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.jiwon_06);
                Toast.makeText(this, "엥?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.secondhabbit:
                Log.d(TAG, "버튼2 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.jiwon_02);
                Toast.makeText(this, "괜찮지", Toast.LENGTH_SHORT).show();
                break;
            case R.id.thirdhabbit:
                Log.d(TAG, "버튼3 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.jiwon_03);
                Toast.makeText(this, "인덩?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fourthhabbit:
                Log.d(TAG, "버튼4 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.jiwon_04);
                Toast.makeText(this, "야아아", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fifthhabbit:
                Log.e(TAG, "버튼5 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.jiwon_05);
                Toast.makeText(this, "어떻니?", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.e(TAG, "버튼1 클릭");
                Toast.makeText(this, "잘못 눌렀습니다.", Toast.LENGTH_SHORT).show();
        }
        Log.d(TAG, "onClick 메소드 무사히 종료");
    }

}

