package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_MS_WORD_AdvancedOperations extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving__m_s__w_o_r_d__advanced_operations);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);
        getSupportActionBar().setTitle("Microsoft Word");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_MSWORDADVANCE);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("MSWORDADVANCE", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/quickstyle.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/usetemplete.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/tablecontent.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/usegraphic.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/watermark.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/previewdocument.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/printdocument.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/comparedocument.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/documentsecurity.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/emaildocuments.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/autoformatting.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/autocorrection.html");
        }
    }

    
    private class mywebviewclient extends WebViewClient {
        @Override 
        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        private mywebviewclient() {
        }

        @Override 
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override 
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override 
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }
}
