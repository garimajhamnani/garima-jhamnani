package com.example.garima.scrollandflingdoubletab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView buckysMessage;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buckysMessage = (TextView)findViewById(R.id.buckystext);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }
///Gesture Begin/////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        buckysMessage.setText("OnSingleTap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        buckysMessage.setText("OnDoubleTap");
        return true;

    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        buckysMessage.setText("OnSingleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        buckysMessage.setText("OnDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        buckysMessage.setText("OnShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        buckysMessage.setText("OnSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        buckysMessage.setText("OnScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        buckysMessage.setText("OnLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {

        buckysMessage.setText("OnFling");
        return true;
    }
    ///End Gesture//////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
