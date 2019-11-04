package eccomerce.app.amazin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PantMeasurements extends AppCompatActivity {

    private Button finish;
    private String gender;
    private LinearLayout menLinearLayout;
    private LinearLayout womenLinearLayout;
    private RadioGroup rGQuestionFourPantSize;
    private RadioGroup rGQuestionFourPantSizeW;
    private RadioGroup rGQuestionMenWaistSizeS;
    private RadioGroup rGQuestionMenWaistSizeM;
    private RadioGroup rGQuestionMenWaistSizeL;
    private RadioGroup rGQuestionMenWaistSizeXL;
    private RadioGroup rGQuestionMenWaistSizeXXL;
    private RadioGroup rGQuestionInseamS;
    private RadioGroup rGQuestionInseamM;
    private RadioGroup rGQuestionInseamL;
    private RadioGroup rGQuestionInseamXL;
    private RadioGroup rGQuestionInseamXXL;
    private RadioGroup rGQuestionWomenWaistSizeXS;
    private RadioGroup rGQuestionWomenWaistSizeS;
    private RadioGroup rGQuestionWomenWaistSizeM;
    private RadioGroup rGQuestionWomenWaistSizeL;
    private RadioGroup rGQuestionWomenWaistSizeXL;
    private RadioGroup rGQuestionWomenWaistSizeXXL;
    private RadioGroup rGQuestionHipsSizeXS;
    private RadioGroup rGQuestionHipsSizeS;
    private RadioGroup rGQuestionHipsSizeM;
    private RadioGroup rGQuestionHipsSizeL;
    private RadioGroup rGQuestionHipsSizeXL;
    private RadioGroup rGQuestionHipsSizeXXL;
    private RadioButton rbSize;
    private RadioButton rbSizeW;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.pant_measurements);

        gender = getIntent().getStringExtra("gender");
        menLinearLayout = findViewById(R.id.linearLayoutMenPantSize);
        womenLinearLayout = findViewById(R.id.linearLayoutWomenPantSize);
        rGQuestionFourPantSize = findViewById(R.id.rGQuestionFourPantSize);
        rGQuestionFourPantSizeW = findViewById(R.id.rGQuestionFourPantSizeW);
        rGQuestionMenWaistSizeS = findViewById(R.id.rGQuestionMenWaistSizeS);
        rGQuestionMenWaistSizeM = findViewById(R.id.rGQuestionMenWaistSizeM);
        rGQuestionMenWaistSizeL = findViewById(R.id.rGQuestionMenWaistSizeL);
        rGQuestionMenWaistSizeXL = findViewById(R.id.rGQuestionMenWaistSizeXL);
        rGQuestionMenWaistSizeXXL = findViewById(R.id.rGQuestionMenWaistSizeXXL);
        rGQuestionInseamS = findViewById(R.id.rGQuestionInseamS);
        rGQuestionInseamM = findViewById(R.id.rGQuestionInseamM);
        rGQuestionInseamL = findViewById(R.id.rGQuestionInseamL);
        rGQuestionInseamXL = findViewById(R.id.rGQuestionInseamXL);
        rGQuestionInseamXXL = findViewById(R.id.rGQuestionInseamXXL);
        rGQuestionWomenWaistSizeXS = findViewById(R.id.rGQuestionWomenWaistSizeXS);
        rGQuestionWomenWaistSizeS = findViewById(R.id.rGQuestionWomenWaistSizeS);
        rGQuestionWomenWaistSizeM = findViewById(R.id.rGQuestionWomenWaistSizeM);
        rGQuestionWomenWaistSizeL = findViewById(R.id.rGQuestionWomenWaistSizeL);
        rGQuestionWomenWaistSizeXL = findViewById(R.id.rGQuestionWomenWaistSizeXL);
        rGQuestionWomenWaistSizeXXL = findViewById(R.id.rGQuestionWomenWaistSizeXXL);
        rGQuestionHipsSizeXS = findViewById(R.id.rGQuestionHipsSizeXS);
        rGQuestionHipsSizeS = findViewById(R.id.rGQuestionHipsSizeS);
        rGQuestionHipsSizeM = findViewById(R.id.rGQuestionHipsSizeM);
        rGQuestionHipsSizeL = findViewById(R.id.rGQuestionHipsSizeL);
        rGQuestionHipsSizeXL = findViewById(R.id.rGQuestionHipsSizeXL);
        rGQuestionHipsSizeXXL = findViewById(R.id.rGQuestionHipsSizeXXL);

        if (gender.equals("MALE")) {
            menLinearLayout.setVisibility(View.VISIBLE);
        } else if (gender.equals("FEMALE")) {
            womenLinearLayout.setVisibility(View.VISIBLE);
        }

        finish = findViewById(R.id.bFinish);


        rGQuestionFourPantSize.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rbSize = group.findViewById(checkedId);

                boolean isChecked = rbSize.isChecked();

                if (isChecked) {
                    switch (rbSize.getText().toString()) {
                        case "S":
                            rGQuestionMenWaistSizeS.setVisibility(View.VISIBLE);
                            rGQuestionInseamS.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionMenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionInseamM.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionInseamL.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionInseamXL.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionInseamXXL.setVisibility(View.GONE);
                            break;
                        case "M":
                            rGQuestionMenWaistSizeM.setVisibility(View.VISIBLE);
                            rGQuestionInseamM.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionMenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionInseamS.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionInseamL.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionInseamXL.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionInseamXXL.setVisibility(View.GONE);
                            break;
                        case "L":
                            rGQuestionMenWaistSizeL.setVisibility(View.VISIBLE);
                            rGQuestionInseamL.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionMenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionInseamS.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionInseamM.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionInseamXL.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionInseamXXL.setVisibility(View.GONE);
                            break;
                        case "XL":
                            rGQuestionMenWaistSizeXL.setVisibility(View.VISIBLE);
                            rGQuestionInseamXL.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionMenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionInseamS.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionInseamM.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionInseamL.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionInseamXXL.setVisibility(View.GONE);
                            break;
                        case "XXL":
                            rGQuestionMenWaistSizeXXL.setVisibility(View.VISIBLE);
                            rGQuestionInseamXXL.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionMenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionInseamS.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionInseamM.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionInseamL.setVisibility(View.GONE);
                            rGQuestionMenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionInseamXL.setVisibility(View.GONE);
                            break;
                    }

                }
            }
        });


        rGQuestionFourPantSizeW.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                rbSizeW = group.findViewById(checkedId);

                boolean isChecked = rbSizeW.isChecked();

                if (isChecked) {
                    switch (rbSizeW.getText().toString()) {
                        case "XS":
                            rGQuestionWomenWaistSizeXS.setVisibility(View.VISIBLE);
                            rGQuestionHipsSizeXS.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionWomenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionHipsSizeS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionHipsSizeM.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionHipsSizeL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXXL.setVisibility(View.GONE);
                            break;
                        case "S":
                            rGQuestionWomenWaistSizeS.setVisibility(View.VISIBLE);
                            rGQuestionHipsSizeS.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionWomenWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionHipsSizeXS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionHipsSizeM.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionHipsSizeL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXXL.setVisibility(View.GONE);
                            break;
                        case "M":
                            rGQuestionWomenWaistSizeM.setVisibility(View.VISIBLE);
                            rGQuestionHipsSizeM.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionWomenWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionHipsSizeXS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionHipsSizeS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionHipsSizeL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXXL.setVisibility(View.GONE);
                            break;
                        case "L":
                            rGQuestionWomenWaistSizeL.setVisibility(View.VISIBLE);
                            rGQuestionHipsSizeL.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionWomenWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionHipsSizeXS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionHipsSizeS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionHipsSizeM.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXXL.setVisibility(View.GONE);
                            break;
                        case "XL":
                            rGQuestionWomenWaistSizeXL.setVisibility(View.VISIBLE);
                            rGQuestionHipsSizeXL.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionWomenWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionHipsSizeXS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionHipsSizeS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionHipsSizeM.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionHipsSizeL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXXL.setVisibility(View.GONE);
                            break;
                        case "XXL":
                            rGQuestionWomenWaistSizeXXL.setVisibility(View.VISIBLE);
                            rGQuestionHipsSizeXXL.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionWomenWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionHipsSizeXS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeS.setVisibility(View.GONE);
                            rGQuestionHipsSizeS.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeM.setVisibility(View.GONE);
                            rGQuestionHipsSizeM.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeL.setVisibility(View.GONE);
                            rGQuestionHipsSizeL.setVisibility(View.GONE);
                            rGQuestionWomenWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionHipsSizeXL.setVisibility(View.GONE);
                            break;
                    }

                }
            }
        });


        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Done.class);
                intent.putExtra("gender", gender);
                startActivity(intent);
                finish();
            }
        });
    }
}
