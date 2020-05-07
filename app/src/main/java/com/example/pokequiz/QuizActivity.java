package com.example.pokequiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuizActivity extends AppCompatActivity {


    @BindView(R.id.Submit_1)
    Button mButton1;
    @BindView(R.id.correct_q1)
    TextView mCorrectQ1;
    @BindView(R.id.wrong_q1)
    TextView mWrongQ1;
    @BindView(R.id.CB1)
    CheckBox mCB1;
    @BindView(R.id.CB2)
    CheckBox mCB2;
    @BindView(R.id.CB3)
    CheckBox mCB3;
    @BindView(R.id.CB4)
    CheckBox mCB4;

    @BindView(R.id.Submit_2)
    Button mButton2;
    @BindView(R.id.radioGroup1)
    RadioGroup mRadioGroup1;
    @BindView(R.id.correct_q2)
    TextView mCorrectQ2;
    @BindView(R.id.wrong_q2)
    TextView mWrongQ2;


//    @BindView(R.id.Finish)
//    Button mButtonFinish;

    public int score = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ButterKnife.bind(this);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCB2.isChecked() && mCB3.isChecked()){
                    score+= 1;
                    mCorrectQ1.setVisibility(View.VISIBLE);
                }
                else
                    mWrongQ1.setVisibility(View.VISIBLE);
                mButton1.setEnabled(false);
            }
        });


        mRadioGroup1.clearCheck();
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb1 = (RadioButton) mRadioGroup1.findViewById(mRadioGroup1.getCheckedRadioButtonId());
                //Toast.makeText(QuizActivity.this, rb1.getText(), Toast.LENGTH_SHORT).show();
                if(rb1.getText().equals("Eevee")){
                    score+=1;
                    mCorrectQ2.setVisibility(View.VISIBLE);
                }
                else
                    mWrongQ2.setVisibility(View.VISIBLE);
                mButton2.setEnabled(false);
            }
        });
//
//
//        mButtonFinish.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(QuizActivity.this, "Your Score : "+String.valueOf(score), Toast.LENGTH_SHORT).show();
//            }
//        });






    }

}
