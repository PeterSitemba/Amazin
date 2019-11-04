package eccomerce.app.amazin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button next;
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.bNext);
        radioGroup = findViewById(R.id.rGQuestionGender);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int radioButtonID = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioButtonID);

                if(radioButton == null){
                    Toast.makeText(MainActivity.this , "Please select one option!" , Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(getBaseContext(), QuestionOne.class);
                    intent.putExtra("gender", radioButton.getText());
                    startActivity(intent);
                    finish();
                }

            }
        });


    }
}
