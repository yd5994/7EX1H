package com.example.a7ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView =(WebView) findViewById(R.id.webview);


    }

    public void buttonBt(View view) {
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        String WW="https://developer.android.com/studio";
        webView.loadUrl(WW);
        webView.setWebViewClient(new MyWebViewClient());
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}