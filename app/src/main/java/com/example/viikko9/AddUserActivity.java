package com.example.viikko9;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_user);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
      //  });
    }

    private void addUser(View view){
        EditText tvfirstName = findViewById(R.id.editFirstName);
        EditText tvlastName = findViewById(R.id.editLastName);
        EditText tvemail = findViewById(R.id.editEmail);

        String firstName = String.valueOf(tvfirstName.getText());
        String lastName = String.valueOf(tvlastName.getText());
        String email = String.valueOf(tvemail.getText());

        RadioGroup degreeOption = findViewById(R.id.radioDergreeProgram);

        RadioButton choice = findViewById(degreeOption.getCheckedRadioButtonId());

        String degree = String.valueOf(choice.getText());


        UserStorage.getInstance().addUser(new User(firstName, lastName, email, degree));
    }
}