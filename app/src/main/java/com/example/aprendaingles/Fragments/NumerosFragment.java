package com.example.aprendaingles.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.aprendaingles.R;

public class

NumerosFragment extends Fragment {

    private ImageView imageN1;
    private ImageView imageN2;
    private ImageView imageN3;
    private ImageView imageN4;
    private ImageView imageN5;
    private ImageView imageN6;
    private MediaPlayer mediaPlayer;

    public NumerosFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view=inflater.inflate(R.layout.fragment_numeros, container, false);

        imageN1 = view.findViewById(R.id.imageN1);
        imageN2 = view.findViewById(R.id.imageN2);
        imageN3 = view.findViewById(R.id.imageN3);
        imageN4 = view.findViewById(R.id.imageN4);
        imageN5 = view.findViewById(R.id.imageN5);
        imageN6 = view.findViewById(R.id.imageN6);


        imageN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                tocarsom();

            }
        });

        imageN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                tocarsom();

            }
        });
        imageN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                tocarsom();

            }
        });
        imageN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                tocarsom();

            }
        });

        imageN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                tocarsom();

            }
        });
        imageN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
                tocarsom();

            }
        });

        return view;
    }
    public void tocarsom() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }
}