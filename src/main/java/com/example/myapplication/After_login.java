package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.github.mikephil.charting.charts.Chart.LOG_TAG;

public class After_login extends Activity {
    private Button income,expense,Transaction,Datewise,Graph_Representation,Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        //Intent intent =getIntent();
        //String username=intent.getStringExtra("Extra message");
        income=(Button)findViewById(R.id.btnIncome);
        expense = (Button) findViewById(R.id.btnExpense);
        Transaction=(Button)findViewById(R.id.btnTransaction);
        Datewise=(Button)findViewById(R.id.btnDatewise);
        Graph_Representation = (Button) findViewById(R.id.btnGraph);
        Exit=(Button)findViewById(R.id.btnExit);
       income.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
             Intent intent = new Intent(After_login.this, third.class);
             startActivity(intent);
           }
       });
        expense.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(After_login.this,final_Activity.class);
                startActivity(intent);
            }
        });
        Transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(After_login.this,Fourth.class);
                startActivity(intent);
            }
        });
        Datewise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(After_login.this,Fifth.class);
                startActivity(intent);
            }
        });
        Graph_Representation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(After_login.this,Sixth.class);
                startActivity(intent);
            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    final AlertDialog.Builder builder=new AlertDialog.Builder(After_login.this);
                    builder.setMessage("Are you sure you want to quit?");
                    builder.setCancelable(true);

                    builder.setPositiveButton(Html.fromHtml("<font color='#FF7F27'>Yes</font>"), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Log.e(LOG_TAG, "Yes");
                            finish();
                            System.exit(0);
                        }
                    });
                builder.setNegativeButton(Html.fromHtml("<font color='#FF7F27'>No</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e(LOG_TAG, "No");
                        dialogInterface.cancel();
                    }
                });
                    AlertDialog alertDialog =builder.create();
                    alertDialog.show();

            }
        });

}}
