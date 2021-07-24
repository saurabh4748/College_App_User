package com.saurabh.pussgrc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Results extends AppCompatActivity {
    private WebView resultWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Results");

        resultWebView=(WebView) findViewById(R.id.resultsWebView);
        resultWebView.setWebViewClient(new WebViewClient());
        resultWebView.loadUrl("https://eakadamik.in/uiethsp/");
        WebSettings webSettings=resultWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
    public class mywebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed(){
        if(resultWebView.canGoBack()) {
            resultWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}