package eccomerce.app.amazin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class QuestionOne extends AppCompatActivity {

    private Button next;
    private String gender;
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.question_one);
        gender = getIntent().getStringExtra("gender");

        next = findViewById(R.id.bNext);
        radioGroup = findViewById(R.id.rGQuestionOne);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioButtonID = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioButtonID);

                if(radioButton == null){
                    Toast.makeText(QuestionOne.this , "Please select one option!" , Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(getBaseContext(), QuestionTwo.class);
                    intent.putExtra("gender", gender);
                    startActivity(intent);
                    finish();
                }
            }
        });


    }
}
