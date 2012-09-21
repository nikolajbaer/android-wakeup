package com.nikolajbaer.wakeup;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class WakeUpActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN | 
            WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD | 
            WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED | 
            WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON,
            WindowManager.LayoutParams.FLAG_FULLSCREEN | 
            WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD | 
            WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED | 
            WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON); 

        setContentView(R.layout.main);
    }
}
