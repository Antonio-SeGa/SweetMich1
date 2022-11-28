package com.example.sweetmich4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PerfilFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        return view;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();

        //Boton de Direccion
        Button btnDir = view.findViewById(R.id.btnAddresse);
        btnDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.replace(R.id.content, new DireccionFragment()).commit();
            }
        });

        //Boton Tarjetas
        Button btnTar = view.findViewById(R.id.btnCards);
        btnTar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.replace(R.id.content, new TarjetasFragment()).commit();
            }
        });

        //Boton Cambio de contraseña
        Button btnPass = view.findViewById(R.id.btnChanPass);
        btnPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.replace(R.id.content, new CambioContraFragment()).commit();
            }
        });

        //Boton acera de nosotros
        Button btnAb = view.findViewById(R.id.btnAboutUs);
        btnAb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.replace(R.id.content, new AcercaDeFragment()).commit();
            }
        });
    }
}