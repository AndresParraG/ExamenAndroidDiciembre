package com.example.examen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrainingSesionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrainingSesionFragment extends ListFragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView listaSeries;
    private ArrayAdapter<Entrenament> adapterSeries;

    public TrainingSesionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TrainingSesionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TrainingSesionFragment newInstance(String param1, String param2) {
        TrainingSesionFragment fragment = new TrainingSesionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        listaSeries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        listaSeries = (ListView) getView().findViewById(R.id.listaViewSeries);
        adapterSeries =new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, Entrenament.entrenaments);
        listaSeries.setAdapter(adapterSeries);
        return inflater.inflate(R.layout.fragment_training_sesion, container, false);
    }

    static interface Listener {
        void itemClicked(long id);
    }
}