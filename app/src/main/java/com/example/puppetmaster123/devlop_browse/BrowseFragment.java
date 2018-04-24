package com.example.puppetmaster123.devlop_browse;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BrowseFragment extends Fragment {


    public BrowseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_browse, container,false);
        final ArrayList<String> catagories = new ArrayList<>();

        catagories.add("All");
        catagories.add("Search Algorithms");
        catagories.add("Sort Algorithms");
        catagories.add("Data Structure");
        catagories.add("Contact Us");
        //catagories.add("Quick Reference");
        // Inflate the layout for this fragment
        ListView listView = (ListView) view.findViewById(R.id.browseMenu);

        ArrayAdapter<String> lvAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, catagories);
        listView.setAdapter(lvAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ArrayList<String> algo = new ArrayList<>();

                if(catagories.get(position) == "All")
                {
                    Intent intent = new Intent(getActivity(), AllAlgorithms.class);
                    algo.add("Linear Search");
                    algo.add("Binary Search");
                    algo.add("Jump Search");
                    algo.add("Selection Sort");
                    algo.add("Merge Sort");
                    algo.add("Insertion Sort");
                    algo.add("Vector");
                    algo.add("Linked List");
                    algo.add("Doubly Linked List");
                    intent.putStringArrayListExtra("key", algo);
                    startActivity(intent);
                }
                else if(catagories.get(position) == "Search Algorithms")
                {
                    Intent intent = new Intent(getActivity(), AllAlgorithms.class);
                    algo.add("Linear Search");
                    algo.add("Binary Search");
                    algo.add("Jump Search");
                    intent.putStringArrayListExtra("key", algo);
                    startActivity(intent);              }
                else if (catagories.get(position) == "Sort Algorithms")
                {
                    Intent intent = new Intent(getActivity(), AllAlgorithms.class);
                    algo.add("Selection Sort");
                    algo.add("Merge Sort");
                    algo.add("Insertion Sort");
                    intent.putStringArrayListExtra("key", algo);
                    startActivity(intent);
                }

                else if(catagories.get(position) == "Data Structure")
                {
                    Intent intent = new Intent(getActivity(), AllAlgorithms.class);
                    algo.add("Vector");
                    algo.add("Linked List");
                    algo.add("Doubly Linked List");
                    intent.putStringArrayListExtra("key", algo);
                    startActivity(intent);
                }

                else if(catagories.get(position) == "Contact Us")
                {
                    Intent intent = new Intent(getActivity(), Contact.class);
                    startActivity(intent);
                }

                else if(catagories.get(position) == "Quick Reference")
                {
                    Intent intent = new Intent(getActivity(), AllAlgorithms.class);
                    startActivity(intent);
                }

            }
        });

        return view;
    }

}
