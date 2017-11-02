package com.example.android.fruitquiz;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SubmitAnswer (View view){
        int score = 0;

        RadioButton carrot = (RadioButton) findViewById(R.id.carrot_rbutton);
        CheckBox mangosteen = (CheckBox) findViewById(R.id.mangosteen_cbox);
        CheckBox Durian = (CheckBox) findViewById(R.id.durian_cbox);
        EditText fruitInput = (EditText) findViewById(R.id.fruit_input);
        RadioButton kingFruit = (RadioButton) findViewById(R.id.fruits);
        EditText fruit2Input = (EditText)findViewById(R.id.fruit2_input);

        String fruitInputAnswer=fruitInput.getText().toString();
        String fruit2InputAnswer=fruit2Input.getText().toString();

        if (carrot.isChecked()){
            score = score + 1;
        }
        if (mangosteen.isChecked()&&Durian.isChecked()){
            score = score + 1;
        }
        if (fruitInputAnswer.equals("Dragon Fruit")){
            score = score + 1;
        }
        if (kingFruit.isChecked()){
            score = score +1;
        }
        if (fruit2InputAnswer.equals("Chinese Gooseberry")){
            score = score +1;
        }

        Toast.makeText(this, "Your Score are "+score, Toast.LENGTH_SHORT).show();

    }
}
