package com.d3mstudio.kamus.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.d3mstudio.kamus.DetailActivity;
import com.d3mstudio.kamus.R;
import com.d3mstudio.kamus.model.KamusModel;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kfazri75 on 1/23/18.
 */

class SearchViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_word)
    TextView tv_word;

    @BindView(R.id.tv_translate)
    TextView tv_translate;

    public SearchViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(final KamusModel item) {
        tv_word.setText(item.getWord());
        tv_translate.setText(item.getTranslate());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.KATA, item.getWord());
                intent.putExtra(DetailActivity.TRANSLATE, item.getTranslate());
                itemView.getContext().startActivity(intent);
            }
        });
    }
}

