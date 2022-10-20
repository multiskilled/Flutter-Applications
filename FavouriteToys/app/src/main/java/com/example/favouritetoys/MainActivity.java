package com.example.favouritetoys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.contentcapture.ContentCaptureCondition;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.widget.Toast;

import com.example.favouritetoys.utilities.NetworkUtils;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText mSearchBoxEditText;
    TextView mUrlDisplayTextView;
    TextView mSearchResultsTextView;
    TextView mToysListTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearchBoxEditText=(EditText) findViewById(R.id.et_search_box);
        mUrlDisplayTextView=(TextView) findViewById(R.id.tv_url_display);
        mSearchResultsTextView=(TextView) findViewById(R.id.tv_github_search_results);

        /**mToysListTextView=(TextView)findViewById(R.id.tv_toy_names);
        String[] toyNames=Toybox.getToys();
        //looping through each toy in the list and append to text view
        for(String toyName:toyNames){
        mToysListTextView.append(toyName +"\n\n\n");
        }
         */

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    void makeGitHubSearchQuery(){
        String githubQuery=mSearchBoxEditText.getText().toString();
        URL githubSearchURL= NetworkUtils.buildUrl(githubQuery);
        mUrlDisplayTextView.setText(githubSearchURL.toString());
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasSelected = item.getItemId();
        if (itemThatWasSelected == R.id.action_search) {

            makeGitHubSearchQuery();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
