package com.example.viikko9;


import android.view.View;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView textFirstName, textLastName, textEmail, textDegreeProgram;


    public UserViewHolder(@NonNull View itemview){
        super(itemview);
        textFirstName = itemview.findViewById(R.id.FirstName);
        textLastName = itemview.findViewById(R.id.LastName);
        textEmail = itemview.findViewById(R.id.Email);
        textDegreeProgram = itemview.findViewById(R.id.DegreeProgram);
    }


}