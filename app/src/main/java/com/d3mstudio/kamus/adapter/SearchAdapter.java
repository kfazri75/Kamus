package com.d3mstudio.kamus.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import com.d3mstudio.kamus.R;
import com.d3mstudio.kamus.model.KamusModel;

import java.util.ArrayList;

/**
 * Created by kfazri75 on 1/23/18.
 */

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    private ArrayList<KamusModel> list = new ArrayList<>();

    public SearchAdapter() {
    }

    public void replaceAll(ArrayList<KamusModel> items) {
        list = items;
        notifyDataSetChanged();
    }

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SearchViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
