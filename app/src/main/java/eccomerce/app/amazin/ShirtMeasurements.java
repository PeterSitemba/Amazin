package eccomerce.app.amazin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShirtMeasurements extends AppCompatActivity {

    private Button next;
    private String gender;
    private LinearLayout menLinearLayout;
    private LinearLayout womenLinearLayout;
    private RadioGroup rGQuestionOne;
    private RadioGroup rGQuestionOneW;
    private RadioGroup rGQuestionNeckSizeS;
    private RadioGroup rGQuestionNeckSizeM;
    private RadioGroup rGQuestionNeckSizeL;
    private RadioGroup rGQuestionNeckSizeXL;
    private RadioGroup rGQuestionNeckSizeXXL;
    private RadioGroup rGQuestionArmLengthS;
    private RadioGroup rGQuestionArmLengthM;
    private RadioGroup rGQuestionArmLengthL;
    private RadioGroup rGQuestionArmLengthXL;
    private RadioGroup rGQuestionArmLengthXXL;
    private RadioGroup rGQuestionBustSizeXS;
    private RadioGroup rGQuestionBustSizeS;
    private RadioGroup rGQuestionBustSizeM;
    private RadioGroup rGQuestionBustSizeL;
    private RadioGroup rGQuestionBustSizeXL;
    private RadioGroup rGQuestionBustSizeXXL;
    private RadioGroup rGQuestionWaistSizeXS;
    private RadioGroup rGQuestionWaistSizeS;
    private RadioGroup rGQuestionWaistSizeM;
    private RadioGroup rGQuestionWaistSizeL;
    private RadioGroup rGQuestionWaistSizeXL;
    private RadioGroup rGQuestionWaistSizeXXL;
    private RadioButton rbSize;
    private RadioButton rbSizeW;
    private RadioButton rbNeckSize;
    private RadioButton rbArmLengthSize;
    private RadioButton rbBustSize;
    private RadioButton rbWaistSize;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.shirt_measurments);

        gender = getIntent().getStringExtra("gender");
        menLinearLayout = findViewById(R.id.linearLayoutMenShirtSize);
        womenLinearLayout = findViewById(R.id.linearLayoutWomenShirtSize);
        rGQuestionOne = findViewById(R.id.rGQuestionOne);
        rGQuestionOneW = findViewById(R.id.rGQuestionOneW);
        rGQuestionNeckSizeS = findViewById(R.id.rGQuestionNeckSizeS);
        rGQuestionNeckSizeM = findViewById(R.id.rGQuestionNeckSizeM);
        rGQuestionNeckSizeL = findViewById(R.id.rGQuestionNeckSizeL);
        rGQuestionNeckSizeXL = findViewById(R.id.rGQuestionNeckSizeXL);
        rGQuestionNeckSizeXXL = findViewById(R.id.rGQuestionNeckSizeXXL);
        rGQuestionArmLengthS = findViewById(R.id.rGQuestionArmLengthS);
        rGQuestionArmLengthM = findViewById(R.id.rGQuestionArmLengthM);
        rGQuestionArmLengthL = findViewById(R.id.rGQuestionArmLengthL);
        rGQuestionArmLengthXL = findViewById(R.id.rGQuestionArmLengthXL);
        rGQuestionArmLengthXXL = findViewById(R.id.rGQuestionArmLengthXXL);
        rGQuestionBustSizeXS = findViewById(R.id.rGQuestionBustSizeXS);
        rGQuestionBustSizeS = findViewById(R.id.rGQuestionBustSizeS);
        rGQuestionBustSizeM = findViewById(R.id.rGQuestionBustSizeM);
        rGQuestionBustSizeL = findViewById(R.id.rGQuestionBustSizeL);
        rGQuestionBustSizeXL = findViewById(R.id.rGQuestionBustSizeXL);
        rGQuestionBustSizeXXL = findViewById(R.id.rGQuestionBustSizeXXL);
        rGQuestionWaistSizeXS = findViewById(R.id.rGQuestionWaistSizeXS);
        rGQuestionWaistSizeS = findViewById(R.id.rGQuestionWaistSizeS);
        rGQuestionWaistSizeM = findViewById(R.id.rGQuestionWaistSizeM);
        rGQuestionWaistSizeL = findViewById(R.id.rGQuestionWaistSizeL);
        rGQuestionWaistSizeXL = findViewById(R.id.rGQuestionWaistSizeXL);
        rGQuestionWaistSizeXXL = findViewById(R.id.rGQuestionWaistSizeXXL);


        if (gender.equals("MALE")) {
            menLinearLayout.setVisibility(View.VISIBLE);
        } else if (gender.equals("FEMALE")) {
            womenLinearLayout.setVisibility(View.VISIBLE);
        }


        rGQuestionOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                rbSize = group.findViewById(checkedId);

                boolean isChecked = rbSize.isChecked();

                if (isChecked) {
                    switch (rbSize.getText().toString()) {
                        case "S":
                            rGQuestionNeckSizeS.setVisibility(View.VISIBLE);
                            rGQuestionArmLengthS.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionNeckSizeM.setVisibility(View.GONE);
                            rGQuestionArmLengthM.setVisibility(View.GONE);
                            rGQuestionNeckSizeL.setVisibility(View.GONE);
                            rGQuestionArmLengthL.setVisibility(View.GONE);
                            rGQuestionNeckSizeXL.setVisibility(View.GONE);
                            rGQuestionArmLengthXL.setVisibility(View.GONE);
                            rGQuestionNeckSizeXXL.setVisibility(View.GONE);
                            rGQuestionArmLengthXXL.setVisibility(View.GONE);
                            break;
                        case "M":
                            rGQuestionNeckSizeM.setVisibility(View.VISIBLE);
                            rGQuestionArmLengthM.setVisibility(View.VISIBLE);

                            rGQuestionNeckSizeS.setVisibility(View.GONE);
                            rGQuestionArmLengthS.setVisibility(View.GONE);
                            rGQuestionNeckSizeL.setVisibility(View.GONE);
                            rGQuestionArmLengthL.setVisibility(View.GONE);
                            rGQuestionNeckSizeXL.setVisibility(View.GONE);
                            rGQuestionArmLengthXL.setVisibility(View.GONE);
                            rGQuestionNeckSizeXXL.setVisibility(View.GONE);
                            rGQuestionArmLengthXXL.setVisibility(View.GONE);
                            break;
                        case "L":
                            rGQuestionNeckSizeL.setVisibility(View.VISIBLE);
                            rGQuestionArmLengthL.setVisibility(View.VISIBLE);

                            rGQuestionNeckSizeS.setVisibility(View.GONE);
                            rGQuestionArmLengthS.setVisibility(View.GONE);
                            rGQuestionNeckSizeM.setVisibility(View.GONE);
                            rGQuestionArmLengthM.setVisibility(View.GONE);
                            rGQuestionNeckSizeXL.setVisibility(View.GONE);
                            rGQuestionArmLengthXL.setVisibility(View.GONE);
                            rGQuestionNeckSizeXXL.setVisibility(View.GONE);
                            rGQuestionArmLengthXXL.setVisibility(View.GONE);
                            break;
                        case "XL":
                            rGQuestionNeckSizeXL.setVisibility(View.VISIBLE);
                            rGQuestionArmLengthXL.setVisibility(View.VISIBLE);

                            rGQuestionNeckSizeS.setVisibility(View.GONE);
                            rGQuestionArmLengthS.setVisibility(View.GONE);
                            rGQuestionNeckSizeM.setVisibility(View.GONE);
                            rGQuestionArmLengthM.setVisibility(View.GONE);
                            rGQuestionNeckSizeL.setVisibility(View.GONE);
                            rGQuestionArmLengthL.setVisibility(View.GONE);
                            rGQuestionNeckSizeXXL.setVisibility(View.GONE);
                            rGQuestionArmLengthXXL.setVisibility(View.GONE);
                            break;
                        case "XXL":
                            rGQuestionNeckSizeXXL.setVisibility(View.VISIBLE);
                            rGQuestionArmLengthXXL.setVisibility(View.VISIBLE);

                            rGQuestionNeckSizeS.setVisibility(View.GONE);
                            rGQuestionArmLengthS.setVisibility(View.GONE);
                            rGQuestionNeckSizeM.setVisibility(View.GONE);
                            rGQuestionArmLengthM.setVisibility(View.GONE);
                            rGQuestionNeckSizeL.setVisibility(View.GONE);
                            rGQuestionArmLengthL.setVisibility(View.GONE);
                            rGQuestionNeckSizeXL.setVisibility(View.GONE);
                            rGQuestionArmLengthXL.setVisibility(View.GONE);
                            break;
                    }

                }
            }
        });

        rGQuestionOneW.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                rbSizeW = group.findViewById(checkedId);

                boolean isChecked = rbSizeW.isChecked();

                if (isChecked) {
                    switch (rbSizeW.getText().toString()) {
                        case "XS":
                            rGQuestionBustSizeXS.setVisibility(View.VISIBLE);
                            rGQuestionWaistSizeXS.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionBustSizeS.setVisibility(View.GONE);
                            rGQuestionWaistSizeS.setVisibility(View.GONE);
                            rGQuestionBustSizeM.setVisibility(View.GONE);
                            rGQuestionWaistSizeM.setVisibility(View.GONE);
                            rGQuestionBustSizeL.setVisibility(View.GONE);
                            rGQuestionWaistSizeL.setVisibility(View.GONE);
                            rGQuestionBustSizeXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionBustSizeXXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXXL.setVisibility(View.GONE);
                            break;
                        case "S":
                            rGQuestionBustSizeS.setVisibility(View.VISIBLE);
                            rGQuestionWaistSizeS.setVisibility(View.VISIBLE);

                            //set the rest to gone
                            rGQuestionBustSizeXS.setVisibility(View.GONE);
                            rGQuestionWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionBustSizeM.setVisibility(View.GONE);
                            rGQuestionWaistSizeM.setVisibility(View.GONE);
                            rGQuestionBustSizeL.setVisibility(View.GONE);
                            rGQuestionWaistSizeL.setVisibility(View.GONE);
                            rGQuestionBustSizeXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionBustSizeXXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXXL.setVisibility(View.GONE);
                            break;
                        case "M":
                            rGQuestionBustSizeM.setVisibility(View.VISIBLE);
                            rGQuestionWaistSizeM.setVisibility(View.VISIBLE);

                            rGQuestionBustSizeXS.setVisibility(View.GONE);
                            rGQuestionWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionBustSizeS.setVisibility(View.GONE);
                            rGQuestionWaistSizeS.setVisibility(View.GONE);
                            rGQuestionBustSizeL.setVisibility(View.GONE);
                            rGQuestionWaistSizeL.setVisibility(View.GONE);
                            rGQuestionBustSizeXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionBustSizeXXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXXL.setVisibility(View.GONE);
                            break;
                        case "L":
                            rGQuestionBustSizeL.setVisibility(View.VISIBLE);
                            rGQuestionWaistSizeL.setVisibility(View.VISIBLE);

                            rGQuestionBustSizeXS.setVisibility(View.GONE);
                            rGQuestionWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionBustSizeS.setVisibility(View.GONE);
                            rGQuestionWaistSizeS.setVisibility(View.GONE);
                            rGQuestionBustSizeM.setVisibility(View.GONE);
                            rGQuestionWaistSizeM.setVisibility(View.GONE);
                            rGQuestionBustSizeXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXL.setVisibility(View.GONE);
                            rGQuestionBustSizeXXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXXL.setVisibility(View.GONE);
                            break;
                        case "XL":
                            rGQuestionBustSizeXL.setVisibility(View.VISIBLE);
                            rGQuestionWaistSizeXL.setVisibility(View.VISIBLE);

                            rGQuestionBustSizeXS.setVisibility(View.GONE);
                            rGQuestionWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionBustSizeS.setVisibility(View.GONE);
                            rGQuestionWaistSizeS.setVisibility(View.GONE);
                            rGQuestionBustSizeM.setVisibility(View.GONE);
                            rGQuestionWaistSizeM.setVisibility(View.GONE);
                            rGQuestionBustSizeL.setVisibility(View.GONE);
                            rGQuestionWaistSizeL.setVisibility(View.GONE);
                            rGQuestionBustSizeXXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXXL.setVisibility(View.GONE);
                            break;
                        case "XXL":
                            rGQuestionBustSizeXXL.setVisibility(View.VISIBLE);
                            rGQuestionWaistSizeXXL.setVisibility(View.VISIBLE);

                            rGQuestionBustSizeXS.setVisibility(View.GONE);
                            rGQuestionWaistSizeXS.setVisibility(View.GONE);
                            rGQuestionBustSizeS.setVisibility(View.GONE);
                            rGQuestionWaistSizeS.setVisibility(View.GONE);
                            rGQuestionBustSizeM.setVisibility(View.GONE);
                            rGQuestionWaistSizeM.setVisibility(View.GONE);
                            rGQuestionBustSizeL.setVisibility(View.GONE);
                            rGQuestionWaistSizeL.setVisibility(View.GONE);
                            rGQuestionBustSizeXL.setVisibility(View.GONE);
                            rGQuestionWaistSizeXL.setVisibility(View.GONE);
                            break;
                    }

                }
            }
        });


        next = findViewById(R.id.bNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), PantMeasurements.class);
                intent.putExtra("gender", gender);
                startActivity(intent);
                finish();
            }
        });

    }
}
