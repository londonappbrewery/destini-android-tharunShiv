package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryState=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button)  findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryState == 1){
                    Toast.makeText(getApplicationContext(), "Hurray!", Toast.LENGTH_SHORT).show();
                    mStoryState=2;
                }

                if(mStoryState==2){
                    mTextView.setText(R.string.T2_Story);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mStoryState=3;
                } else if(mStoryState==3) {
                    mTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryState=4;
                } else if(mStoryState==4){
                    mTextView.setText(R.string.T3_End);
                    mButtonTop.setText(R.string.T7_End1);
                    mButtonBottom.setText(R.string.T7_End2);
                    mStoryState=2;
                } else if(mStoryState==5){
                    mTextView.setText(R.string.T7_Story);
                    mButtonTop.setText(R.string.T7_Ans1);
                    mButtonBottom.setText(R.string.T7_Ans2);
                    mStoryState = 6;
                } else if(mStoryState==6){
                    mTextView.setText(R.string.T5_Story);
                    mButtonTop.setText(R.string.T5_Ans1);
                    mButtonBottom.setText(R.string.T5_Ans2);
                    mStoryState = 8;
                }
                 else if(mStoryState==8){
                    mTextView.setText(R.string.T6_Story);
                    mButtonTop.setText(R.string.T6_Ans1);
                    mButtonBottom.setText(R.string.T6_Ans2);
                    mStoryState = 9;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryState == 1){
                    Toast.makeText(getApplicationContext(), "Get ready to be Amazed!", Toast.LENGTH_SHORT).show();
                    mStoryState=2;
                }

                if(mStoryState==2){
                    mTextView.setText(R.string.T2_Story);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mStoryState=3;
                } else if(mStoryState==3) {
                    mTextView.setText(R.string.T3_Story);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mStoryState=4;
                } else if(mStoryState==4){
                    mTextView.setText(R.string.T4_Story);
                    mButtonTop.setText(R.string.T4_Ans1);
                    mButtonBottom.setText(R.string.T4_Ans2);
                    mStoryState=5;
                } else if(mStoryState==5){
                    mTextView.setText(R.string.T5_Story);
                    mButtonTop.setText(R.string.T5_Ans1);
                    mButtonBottom.setText(R.string.T5_Ans2);
                    mStoryState=7;
                } else if(mStoryState==6){
                    mTextView.setText(R.string.T7_End);
                    mButtonTop.setText(R.string.T7_End2);
                    mButtonBottom.setText(R.string.T7_End1);
                    mStoryState=2;
                }   else if(mStoryState==9){
                    mTextView.setText(R.string.T6_End);
                    mButtonTop.setText(R.string.T7_End2);
                    mButtonBottom.setText(R.string.T7_End1);
                    mStoryState=2;
                }
            }
        });

    }
}
