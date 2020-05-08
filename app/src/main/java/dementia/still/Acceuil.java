package dementia.still;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tomer.fadingtextview.FadingTextView;

import java.util.concurrent.TimeUnit;

public class Acceuil extends AppCompatActivity {

    private static int WELCOME_TIMEOUT = 5000;
    private FadingTextView fadingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
        fadingTextView = findViewById(R.id.fading_text_view);
        final Button button = (Button)findViewById(R.id.start_choice);
        button.setVisibility(View.INVISIBLE);
        button.postDelayed(new Runnable() {
            public void run() {
                button.setVisibility(View.VISIBLE);
            }
        }, 8000);
    }

    public void startExample2(View v) {

        Intent welcome = new Intent(Acceuil.this,Choice.class);
        startActivity(welcome);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_choice);
    }
}
