package com.example.examen_arnau;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GuideFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GuideFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ArrayList<Guide> guides = new ArrayList<>();
    private RecyclerView recyclerView;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GuideFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GuideFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GuideFragment newInstance(String param1, String param2) {
        GuideFragment fragment = new GuideFragment();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        initData();

        MyAdapter myAdapter = new MyAdapter(guides, view.getContext());
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

    private void initData(){
        guides.clear();

        ArrayList<Integer> pics1 = new ArrayList<>();
        pics1.add(R.drawable.m1a1);
        pics1.add(R.drawable.m1a2);
        pics1.add(R.drawable.m1a3);
        pics1.add(R.drawable.m1a4);
        pics1.add(R.drawable.m1a5);

        Guide guide1 = new Guide("MACBA", "Barcelona", "12",
                R.drawable.m1,
                "Welcome to MACBA, a space for discovery and shared knowledge in Barcelona's Raval neighbourhood. Come and visit a collection of iconic pieces that represent key moments in the past century of art, culture and society.",
                pics1);

        ArrayList<Integer> pics2 = new ArrayList<>();
        pics2.add(R.drawable.m2a1);
        pics2.add(R.drawable.m2a2);
        pics2.add(R.drawable.m2a3);
        Guide guide2 = new Guide("MNAC", "Barcelona", "Free",
                R.drawable.m2,
                "MNAC or Museu Nacional d'Art de Catalunya is the national museum of Catalan. The museum exhibits a collection of Romanesque paintings and Catalan art from the 19th and 20th century. MNAC was constructed for the International Expo in 1929 and is located in the Palau Nacional building of Montjuïc.",
                pics2);

        ArrayList<Integer> pics3 = new ArrayList<>();
        pics3.add(R.drawable.m3a1);
        pics3.add(R.drawable.m3a2);
        pics3.add(R.drawable.m3a3);
        Guide guide3= new Guide("Disseny Museum", "Barcelona", "15",
                R.drawable.m3,
                "The Museu del Disseny de Barcelona (Catalan, English: \"Barcelona Design Museum\"), is a new center of Barcelona's Institute of Culture, which works to promote better understanding and good use of the design world, acting as a museum and laboratory. It focuses on 4 branches or design disciplines: space design, product design, information design and fashion.",
                pics3);

        ArrayList<Integer> pics4 = new ArrayList<>();
        pics4.add(R.drawable.m4a1);
        pics4.add(R.drawable.m4a2);
        Guide guide4= new Guide("Museu Ciències Naturals", "Barcelona", "10",
                R.drawable.m4,
                "The Museum of Natural Sciences of Barcelona (in Catalan, Museu de Ciències Naturals de Barcelona; in Spanish, Museo de Ciencias Naturales de Barcelona) is a natural history museum located in Barcelona, Spain.",
                pics4);

        ArrayList<Integer> pics5 = new ArrayList<>();
        pics5.add(R.drawable.m5a1);
        pics5.add(R.drawable.m5a2);
        Guide guide5= new Guide("MOCO", "Barcelona", "19",
                R.drawable.m5,
                "Moco Masters Contemporary highlights the rising stars of our time with unique works by David LaChapelle, Hayden Kays, Harland Miller, Julian Opie, Nick Thomm, Takashi Murakami & More.",
                pics5);

        ArrayList<Integer> pics6 = new ArrayList<>();
        pics6.add(R.drawable.m6a1);
        pics6.add(R.drawable.m6a2);
        Guide guide6= new Guide("Picasso Museum", "Barcelona", "19",
                R.drawable.m6,
                "The Museu Picasso (Catalan pronunciation: [muˈzɛw piˈkasu], \"Picasso Museum\"), located in Barcelona, Catalonia, Spain, houses one of the most extensive collections of artworks by the 20th-century Spanish artist Pablo Picasso. It has since been declared a museum of national interest by the Government of Catalonia.",
                pics6);

        guides.add(guide1);
        guides.add(guide2);
        guides.add(guide3);
        guides.add(guide4);
        guides.add(guide5);
        guides.add(guide6);
    }
}