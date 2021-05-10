package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

//RadioButton is a two states button which is either checked or unchecked. If a single radio button is unchecked, we can click it to make checked radio button. Once a radio button is checked, it cannot be marked as unchecked by user.
//Using android studio,design an application that demonstrates radio button.(5 Marks)
//.
//Note: submit your work in the next class for grading:
public class MainActivity extends AppCompatActivity {
    //Creating variables to be used

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radio_group);
        textView= findViewById(R.id.text_view_selected);

        Button buttonSelect=findViewById(R.id.button_select);
        buttonSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton =findViewById(radioId);

                textView.setText("Your Choice: "+ radioButton.getText());

            }
        });

    }
//Creating a method for toast button to show what was selected
    public void  checkButton(View view){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton =findViewById(radioId);

        Toast.makeText(this, "Selected Radio Button: "+ radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}