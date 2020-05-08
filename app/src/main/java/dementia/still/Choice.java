package dementia.still;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
public class Choice extends AppCompatActivity {

    private String name;
    private int productivity;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);


    }


        public void set_name(View view) throws IOException {
                    EditText nom = findViewById(R.id.Name);
                    this.name = nom.getText().toString().trim();
                    TextView text1 = findViewById(R.id.WYN);
                    Animation aniFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                    text1.startAnimation(aniFade);
                    text1.setTextSize(33);
                    text1.setText("On a scale from one to ten, how productive do you consider yourself ? \n");
                    Animation aniFade1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                    text1.startAnimation(aniFade1);
                    Button accept_name = (Button) findViewById(R.id.correct_name);
                    accept_name.setVisibility(view.INVISIBLE);

        }

        public void set_productivity(View view) throws IOException{
            //    EditText prod = findVieById(R.id.//Mettre le nom du texte);
            //    this.productivity = prod.getText().toString().trim() // Changer en Integer
        }






}








