package com.example.execicioum;
import android.widget.ImageView;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import com.example.execicioum.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {
    private ImagemViewModel viewModel;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
       binding.setLifecycleOwner(this);

        viewModel = new ViewModelProvider(this).get(ImagemViewModel.class);
        binding.setViewModel(viewModel);
    }
    @BindingAdapter("android:src")
    public static void bindImagem(ImageView iv, int imagem){
        iv.setImageResource(imagem);
    }

}