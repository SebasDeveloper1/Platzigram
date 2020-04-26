package com.canibal.platzigram.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.canibal.platzigram.R;
import com.canibal.platzigram.adapter.PictureAdapterRecyclerView;
import com.canibal.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar(getResources().getString(R.string.tab_home), false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity() );

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;

    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://loqueva.com/wp-content/uploads/2018/02/connor-surdi-fotograf%C3%ADa-paisajes-loqueva-1-200x200.jpg", "Sebastian Pedroza","4 dias", "3 Me gusta"));
        pictures.add(new Picture("https://i.blogs.es/681b1b/este-video-nos-descubre-los-bellos-cielos-de-desierto-de-atacama/200_200.jpg", "Sebastian Bonilla","5 dias", "2 Me gusta"));
        pictures.add(new Picture("https://fotoherman.com/ProfesionaL/wp-content/uploads/2014/03/paisaje-lago-tota-200x200.jpg", "Sebas Pedroza","1 dias", "20 Me gusta"));
        return pictures;


    }

    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

}
