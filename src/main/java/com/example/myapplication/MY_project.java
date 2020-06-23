package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
//
//import com.google.android.gms.auth.api.signin.GoogleSignInClient;
//import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.api.Api;
//import com.google.android.gms.common.api.GoogleApi;
//import com.google.android.gms.common.api.GoogleApiClient;
//import com.google.android.gms.common.api.PendingResult;
//import com.google.android.gms.common.api.Status;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class MY_project extends AppCompatActivity {
    private EditText name;
    private EditText Password;
    private Button Login,Register;
    //private FirebaseAuth firebaseAuth;
   // private static final String TAG="SignInActivity";
   // private static final int RC_Sign_in=9001;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_project);


//        if (firebaseAuth.getCurrentUser()!= null) {
//            startActivity(new Intent(MY_project.this,After_login.class));
//            finish();
//        }
        name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.btnLogin);
        Register=(Button)findViewById(R.id.btnRegister);
       // firebaseAuth=FirebaseAuth.getInstance();

        Login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                startActivity(new Intent(MY_project.this,After_login.class));
//                String username=Name.getText().toString();
//                String password=Password.getText().toString();
////
////
//                if(TextUtils.isEmpty(username)){
//                    Toast.makeText(MY_project.this, "Enter email address!", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(TextUtils.isEmpty(password)){
//                    Toast.makeText(getApplicationContext(), "Enter Password!", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(password.length()<6)
//                {
//                    Toast.makeText(getApplicationContext(), "Password too short!", Toast.LENGTH_SHORT).show();
//                    return;
//                }

//                firebaseAuth.signInWithEmailAndPassword(username, password)
//                        .addOnCompleteListener(MY_project.this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if (task.isSuccessful()) {
//                                    Toast.makeText(MY_project.this, "Login Complete", Toast.LENGTH_SHORT).show();

//
//                                }
//                                else {
//
//                                    Toast.makeText(MY_project.this, "Authentication failed", Toast.LENGTH_SHORT).show();
//
//
//                                    //finish();
//                                }
//
//                                // ...
//                            }
//                        });
            }
        });

//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestIdToken(getString(R.string.default_web_client_id))
//                .requestEmail()
//                .build();
//         googleApiClient =new GoogleApiClient.(this);
//        private void signIn() {
//            Intent signInIntent = GoogleSignInClientApi.getSignInIntent();
//            startActivityForResult(signInIntent, RC_Sign_in);
//        }
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MY_project.this, com.example.myapplication.Register.class);
                startActivity(intent);
            }
        });

    }
}
