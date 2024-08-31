package com.example.execicioum;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ImagemViewModel extends ViewModel {
    private MutableLiveData<Integer> qtdLikes = new MutableLiveData<>(0);
    private MutableLiveData<Integer> imagemLikes = new MutableLiveData<>(R.drawable.like_normal);
    private String nome = "Joana"; // Valor padrão
    private String sobrenome = "D'arc"; // Valor padrão

    public ImagemViewModel(){
    }

    public LiveData<Integer> getQtdLikes() {
        return qtdLikes;
    }

    public LiveData<Integer> getImagemLikes() {
        return imagemLikes;
    }

    public void darLike() {
        int likesAtuais = qtdLikes.getValue();
        qtdLikes.setValue(likesAtuais+1);

        if (likesAtuais >= 0 && likesAtuais <= 3) {
            imagemLikes.setValue(R.drawable.like_normal);
        } else if (likesAtuais >= 4 && likesAtuais <= 9) {
            imagemLikes.setValue(R.drawable.coracao);
        } else if (likesAtuais >= 10 && likesAtuais <= 11){
            imagemLikes.setValue(R.drawable.fogo);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}