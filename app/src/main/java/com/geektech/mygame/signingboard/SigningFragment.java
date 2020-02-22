package com.geektech.mygame.signingboard;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.geektech.mygame.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SigningFragment extends Fragment {


    public SigningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signing, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textTitle=view.findViewById(R.id.textTitle);
        EditText loginText=view.findViewById(R.id.login);
        EditText passText=view.findViewById(R.id.login);
        Button signupBtn=view.findViewById(R.id.signUp);
        int position = getArguments().getInt("position");
        switch (position){
            case 0:
                textTitle.setText("Приветсвую тебя в своем первом приложении и игре, чтобы войти и начать играть, свайпни влево и зарегистрируйся");
                break;
            case 1:
                textTitle.setText("Пока что это не работает");
                break;
        }


    }
}
