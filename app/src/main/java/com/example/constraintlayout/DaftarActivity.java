package com.example.constraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama= findViewById(R.id.editTextTextPersonName);
        edtAlamat= findViewById(R.id.editTextTextPersonName2);
        edtEmail= findViewById(R.id.editTextTextPersonName3);
        edtPassword= findViewById(R.id.editTextTextPersonName4);
        edtrepass= findViewById(R.id.editTextTextPersonName5);

        fab= findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNama.getText().toString().isEmpty()||
                        edtAlamat.getText().toString().isEmpty()||
                        edtEmail.getText().toString().isEmpty()||
                        edtPassword.getText().toString().isEmpty()||
                        edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view,"Wajih isi seluruh datam!!!", Snackbar.LENGTH_LONG).show();
                }
                else{
                    if(edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...",Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else{
                        Snackbar.make(view,"Password dan Repassword harus sama!!!", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });

    }


}