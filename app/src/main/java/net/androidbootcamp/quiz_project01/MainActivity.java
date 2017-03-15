package net.androidbootcamp.quiz_project01;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///////////layout
        final LinearLayout layout_1 =(LinearLayout)findViewById(R.id.layout_1);
        final LinearLayout layout_2 =(LinearLayout)findViewById(R.id.layout_2);


        ///////////titlelayout

        final    Button quiz_1 =(Button)findViewById(R.id.quiz_1);
        final    Button quiz_2 =(Button)findViewById(R.id.quiz_2);
        final    Button quiz_3 =(Button)findViewById(R.id.quiz_3);


        ///// qustionlayout

        final    RadioButton radioButton_1=(RadioButton)findViewById(R.id.radioButton1);
        final    RadioButton radioButton_2=(RadioButton)findViewById(R.id.radioButton2);
        final    RadioButton radioButton_3=(RadioButton)findViewById(R.id.radioButton3);
        final    RadioButton radioButton_4=(RadioButton)findViewById(R.id.radioButton4);
        final    Button next =(Button)findViewById(R.id.next);
        final    Button prev =(Button)findViewById(R.id.prev);
        final    TextView question = (TextView)findViewById(R.id.question);
        final    RadioGroup group =(RadioGroup)findViewById(R.id.group);

        final Context context=this;

        final  Dialog dialog= new Dialog(context);

        quiz_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                dialog.setContentView(R.layout.dialog);
                dialog.setTitle("Result");
                TextView txt_dialog =(TextView)dialog.findViewById(R.id.textView);
                txt_dialog.setText("write Password");
                Button btn_dialog = (Button)dialog.findViewById(R.id.ok);
                Button cancel = (Button)dialog.findViewById(R.id.cancel);


                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();}});

                btn_dialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        EditText ss =(EditText)findViewById(R.id.txt);
                        if (ss.getText().toString().equals("123")){
                            System.out.println("jh");
                            layout_1.setVisibility(view.GONE);
                            layout_2.setVisibility(view.VISIBLE);
                            layout_2.setBackgroundResource(R.drawable.p1);
                            dialog.cancel();

                        }else
                            Toast.makeText(MainActivity.this, "Error password", Toast.LENGTH_LONG).show();
                    }
                });
                dialog.show();
            }

        });
    }}