package com.example.pokequiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
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


    @BindView(R.id.Submit_3)
    Button mButton3;
    @BindView(R.id.radioGroup2)
    RadioGroup mRadioGroup2;
    @BindView(R.id.correct_q3)
    TextView mCorrectQ3;
    @BindView(R.id.wrong_q3)
    TextView mWrongQ3;

    @BindView(R.id.Submit_4)
    Button mButton4;
    @BindView(R.id.enter_q4)
    EditText mEditText;
    @BindView(R.id.correct_q4)
    TextView mCorrectQ4;
    @BindView(R.id.wrong_q4)
    TextView mWrongQ4;
    @BindView(R.id.thumb_q4)
    ImageView mImageview;

    @BindView(R.id.Submit_5)
    Button mButton5;
    @BindView(R.id.radioGroup3)
    RadioGroup mRadioGroup3;
    @BindView(R.id.correct_q5)
    TextView mCorrectQ5;
    @BindView(R.id.wrong_q5)
    TextView mWrongQ5;


    @BindView(R.id.Finish)
    Button mButtonFinish;

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

        mRadioGroup2.clearCheck();
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb2 = (RadioButton) mRadioGroup2.findViewById(mRadioGroup2.getCheckedRadioButtonId());
                //Toast.makeText(QuizActivity.this, rb1.getText(), Toast.LENGTH_SHORT).show();
                if(rb2.getText().equals("Water")){
                    score+=1;
                    mCorrectQ3.setVisibility(View.VISIBLE);
                }
                else
                    mWrongQ3.setVisibility(View.VISIBLE);
                mButton3.setEnabled(false);
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEditText.getText().toString().equals("Lugia")){
                    score+=1;
                    mCorrectQ4.setVisibility(View.VISIBLE);
                }
                else {
                    mWrongQ4.setVisibility(View.VISIBLE);
                }
                mImageview.setImageResource(R.mipmap.answer_4);
                mButton4.setEnabled(false);
            }
        });


        mRadioGroup3.clearCheck();
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb3 = (RadioButton) mRadioGroup3.findViewById(mRadioGroup3.getCheckedRadioButtonId());
                //Toast.makeText(QuizActivity.this, rb1.getText(), Toast.LENGTH_SHORT).show();
                if(rb3.getText().equals("Bug")){
                    score+=1;
                    mCorrectQ5.setVisibility(View.VISIBLE);
                }
                else
                    mWrongQ5.setVisibility(View.VISIBLE);
                mButton5.setEnabled(false);
            }
        });


        mButtonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, "Your Score : "+String.valueOf(score), Toast.LENGTH_SHORT).show();
            }
        });






    }

}
