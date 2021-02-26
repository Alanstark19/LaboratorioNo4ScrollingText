package com.example.laboratoriono2scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //campos
    private TextView txtArticleTitle;

    private TextView txtArticleSubtitle;

    private TextView txtArticle;

    private TextView txtAuthor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* instancia de la clase TextView // casteo// */
        txtArticleTitle = (TextView) findViewById(R.id.article_heading);
        txtArticleSubtitle = (TextView) findViewById(R.id.article_subheading);
        txtArticle = (TextView) findViewById(R.id.article);
        txtAuthor = (TextView) findViewById(R.id.author_name);

    }
}