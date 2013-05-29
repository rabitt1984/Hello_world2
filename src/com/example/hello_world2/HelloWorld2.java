package com.example.hello_world2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HelloWorld2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_world2, menu);
        return true;
    }
    
}
