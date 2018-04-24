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
import java.util.LinkedList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllFragment extends Fragment {


    public AllFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_all, container, false);
        ArrayList<String> all = new ArrayList<>();
       /* all.add("Selection Sort");
        all.add("Merge Sort");
        all.add("Insertion Sort");
        all.add("Linear Search");
        all.add("Binary Search");
        all.add("Jump Search");
        all.add("Vector");
        all.add("Linked List");
        all.add("Doubly Linked List");
       */
       all = getActivity().getIntent().getStringArrayListExtra("key");
        ListView listView = (ListView) view.findViewById(R.id.browseAll);

        ArrayAdapter<String> lvAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, all);
        listView.setAdapter(lvAdapter);

        final ArrayList<String> finalAll = all;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(finalAll.get(position).equals("Selection Sort"))
                {
                    Intent intent = new Intent(getActivity(), SelectionSortAct.class);
                    startActivity(intent);
                }
                if(finalAll.get(position).equals("Merge Sort"))
                {
                    Intent intent = new Intent(getActivity(), MergeSort.class);
                    startActivity(intent);
                }
                else if (finalAll.get(position).equals("Insertion Sort"))
                {
                    Intent intent = new Intent(getActivity(), InsertionSort.class);
                    startActivity(intent);
                }

                else if(finalAll.get(position).equals("Linear Search"))
                {
                    Intent intent = new Intent(getActivity(), LinearSearch.class);
                    startActivity(intent);

                }

                else if(finalAll.get(position).equals("Jump Search"))
                {
                    Intent intent = new Intent(getActivity(), JumpSearch.class);
                    startActivity(intent);
                }

                else if(finalAll.get(position).equals("Binary Search"))
                {
                    Intent intent = new Intent(getActivity(), BinarySearch.class);
                    startActivity(intent);
                }

                else if(finalAll.get(position).equals("Vector"))
                {
                    Intent intent = new Intent(getActivity(), VectorDS.class);
                    startActivity(intent);
                }

                else if(finalAll.get(position).equals("Linked List"))
                {
                    Intent intent = new Intent(getActivity(), LinkedListDS.class);
                    startActivity(intent);
                }

                else if(finalAll.get(position).equals("Doubly Linked List"))
                {
                    Intent intent = new Intent(getActivity(), DoubleDS.class);
                    startActivity(intent);
                }
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

}
