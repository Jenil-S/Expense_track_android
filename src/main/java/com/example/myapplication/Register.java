//package com.example.myapplication;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//import android.widget.ToggleButton;
//
////import com.google.android.gms.tasks.OnCompleteListener;
////import com.google.android.gms.tasks.Task;
////import com.google.firebase.auth.AuthResult;
////import com.google.firebase.auth.FirebaseAuth;
//
//public class Register extends AppCompatActivity {
//
//    private Button reg;
//    EditText email,password,confirmpassword;
//
//   //private FirebaseAuth firebaseAuth;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//
//        reg= (Button) findViewById(R.id.btnreg);
//        email=(EditText) findViewById(R.id.etemail);
//        password=(EditText) findViewById(R.id.etepassword);
//        confirmpassword=(EditText) findViewById(R.id.etconfirm);
//
////        reg.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Intent intent=new Intent(Register.this,After_login.class);
////                startActivity(intent);
////            }
////        });
//     // firebaseAuth=FirebaseAuth.getInstance();
//       reg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String Email=email.getText().toString().trim();
//                String Password=password.getText().toString().trim();
//                String confirmp=confirmpassword.getText().toString().trim();
//
//
//                if(TextUtils.isEmpty(Email)){
//                    Toast.makeText(Register.this,"Please enter email",Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(TextUtils.isEmpty(Password)){
//                    Toast.makeText(Register.this,"Please enter password",Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(TextUtils.isEmpty(confirmp)){
//                    Toast.makeText(Register.this,"Please enter confirm password",Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(Password.length()<6) {
//                    Toast.makeText(Register.this, "Password too short", Toast.LENGTH_SHORT).show();
//                }
//                startActivity(new Intent(getApplicationContext(),After_login.class));
//
//
//                if (Password.equals(confirmp)) {
////                        firebaseAuth.createUserWithEmailAndPassword(Email, Password)
////                                .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
////                                    @Override
////                                    public void onComplete(@NonNull Task<AuthResult> task) {
////                                        if (task.isSuccessful()) {
////                                            Toast.makeText(Register.this, "Registration complete", Toast.LENGTH_SHORT).show();
//
////
////                                        } else {
////                                            startActivity(new Intent(getApplicationContext(),After_login.class));
////                                            Toast.makeText(Register.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
////
////                                        }
////
////                                        // ...
////                                    }
////                                });
//
//
//                    }
//
//
//
//            }
//        });
//
//        }
//
//}
