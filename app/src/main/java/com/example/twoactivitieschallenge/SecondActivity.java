package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;
import java.net.URI;

public class SecondActivity extends AppCompatActivity {
    public static final String first =
            "Each new activity you add to your project has its own layout and Java files, separate from those of the main activity. They also have their own <activity> elements in the AndroidManifest.xml file. As with the main activity, new activity implementations that you create in Android Studio also extend from the AppCompatActivity class.\n\n Each activity in your app is only loosely connected with other activities. However, you can define an activity as a parent of another activity in the AndroidManifest.xml file. This parent-child relationship enables Android to add navigation hints such as left-facing arrows in the title bar for each activity.\n\n An activity communicates with other activities (in the same app and across different apps) with an intent. An Intent can be explicit or implicit:\n\n An explicit intent is one in which you know the target of that intent; that is, you already know the fully qualified class name of that specific activity.\n\n An implicit intent is one in which you do not have the name of the target component, but have a general action to perform.\n\n In this task you add a second activity to our app, with its own layout. You modify the AndroidManifest.xml file to define the main activity as the parent of the second activity. Then you modify the launchSecondActivity() method in MainActivity to include an intent that launches the second activity when you click the button.\n\n 2.1 Create the second Activity\n\nClick the app folder for your project and choose File > New > android.app.Activity > Empty Activity.\n\n Name the new Activity SecondActivity. Make sure Generate Layout File and Backwards Compatibility (AppCompat) are checked. The layout name is filled in as activity_second. Do not check the Launcher Activity option.\n\n Click Finish. Android Studio adds both a new Activity layout (activity_second.xml) and a new Java file (SecondActivity.java) to your project for the new Activity. It also updates the AndroidManifest.xml file to include the new Activity.";
    public static final String second =
            "In the last task, you added an explicit intent to MainActivity that launched SecondActivity. You can also use an intent to send data from one activity to another while launching it.\n\n Your intent object can pass data to the target activity in two ways: in the data field, or in the intent extras. The intent data is a URI indicating the specific data to be acted on. If the information you want to pass to an activity through an intent is not a java.net.URI, or you have more than one piece of information you want to send, you can put that additional information into the extras instead.\n\n The intent extras are key/value pairs in a Bundle. A Bundle is a collection of data, stored as key/value pairs. To pass information from one activity to another, you put keys and values into the intent extra Bundle from the sending activity, and then get them back out again in the receiving activity.\n\n In this task, you modify the explicit intent in MainActivity to include additional data (in this case, a user-entered string) in the intent extra Bundle. You then modify SecondActivity to get that data back out of the intent extra Bundle and display it on the screen.\n\n The Intent extras are key/value pairs in a Bundle. A Bundle is a collection of data, stored as key/value pairs. To pass information from one Activity to another, you put keys and values into the Intent extra Bundle from the sending Activity, and then get them back out again in the receiving Activity.";
    public static final String third =
            "An Activity represents a single screen in your app with which your user can perform a single, focused task such as taking a photo, sending an email, or viewing a map. An activity is usually presented to the user as a full-screen window.\n\n An app usually consists of multiple screens that are loosely bound to each other. Each screen is an activity. Typically, one activity in an app is specified as the main activity (MainActivity.java), which is presented to the user when the app is launched. The main activity can then start other activities to perform different actions.\n\n Each time a new activity starts, the previous activity is stopped, but the system preserves the activity in a stack (the back stack). When a new activity starts, that new activity is pushed onto the back stack and takes user focus. The back stack follows basic last in, first out  stack logic. When the user is done with the current activity and presses the Back button, that activity is popped from the stack and destroyed, and the previous activity resumes.\n\n An activity is started or activated with an intent. An Intent is an asynchronous message that you can use in your activity to request an action from another activity, or from some other app component. You use an intent to start one activity from another activity, and to pass data between activities.\n\n An Intent can be explicit or implicit:\n\n An explicit intent is one in which you know the target of that intent. That is, you already know the fully qualified class name of that specific activity.\n\n An implicit intent is one in which you do not have the name of the target component, but you have a general action to perform.\n\n In this practical you create explicit intents. You find out how to use implicit intents in a later practical.";
    private int val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        val = getIntent().getExtras().getInt("myKey",1);
        TextView textView = findViewById(R.id.first_paragraph);
        if (val == 1){
            textView.setText(first);
        }
        else if (val == 2){
            textView.setText(second);
        }
        else{
            textView.setText(third);
        }



    }
}