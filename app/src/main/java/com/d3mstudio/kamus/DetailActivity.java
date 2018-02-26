package com.d3mstudio.kamus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    public static final String KATA = "KATA";
    public static final String TRANSLATE = "TRANSLATE";

    @BindView(R.id.tv_kata)
    TextView tv_kata;

    @BindView(R.id.tv_translate)
    TextView tv_translate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogoDescription(getResources().getString(R.string.app_name));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ButterKnife.bind(this);

        tv_kata.setText(getIntent().getStringExtra(KATA));
        tv_translate.setText(getIntent().getStringExtra(TRANSLATE));
    }
}
