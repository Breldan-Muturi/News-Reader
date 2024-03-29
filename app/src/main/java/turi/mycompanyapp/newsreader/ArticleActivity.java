package turi.mycompanyapp.newsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        WebView webview = findViewById(R.id.webView);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.setWebViewClient( new WebViewClient());

        Intent intent = getIntent();

        webview.loadData(intent.getStringExtra("content"), "text/html", "UTF-8");
    }
}
