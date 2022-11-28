package com.example.sweetmich4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class HomeFragment extends Fragment {

    Button button;

    SliderView sliderView;
    int[] images = {R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        sliderView = view.findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
        //Catalogo
        Button button = (Button)view.findViewById(R.id.buttonCat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content, new CatalogoFragment()).commit();
            }
        });

        //Arma tu poatre
        Button button2 = (Button)view.findViewById(R.id.buttonArm);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content, new PaquetesFragment()).commit();
            }
        });

        //Arma tu poatre
        Button button3 = (Button)view.findViewById(R.id.buttonPaq);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content, new CatalogoFragment()).commit();
            }
        });
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonCat: getParentFragmentManager().beginTransaction().replace(R.id.content, new PaquetesFragment()).commit();
                break;
            case R.id.buttonArm: getParentFragmentManager().beginTransaction().replace(R.id.content, new PerfilFragment()).commit();
                break;
            case R.id.buttonPaq: getParentFragmentManager().beginTransaction().replace(R.id.content, new CatalogoFragment()).commit();
                break;
        }
    }
}