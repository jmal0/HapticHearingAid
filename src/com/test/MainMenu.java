package com.test;

// Android imports
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

// Activity for the main menu screen
public class MainMenu extends Activity {

    // Method called when the main menu screen is created. Overrides onCreate method of Activity
    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
    }
    

    // Method called when the user reopens the app. Overrides the onResume method of Activity
    @Override
    protected void onResume(){
        super.onResume();
    }
    
    private void updateScores(){
    }
    
}
