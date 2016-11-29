package com.hwj.gdv;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hwj.gdv.databinding.ActivityMainBinding;
import com.junmeng.gdv.GestureDetectorView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.gdvGesture.setOnGestureListener(new GestureDetectorView.OnGestureListener() {
            /**
             * @param gesture  手势
             * @param velocity 缩放手势表示范围，滑动手势表示速率
             */
            @Override
            public void onGesture( int gesture, float velocity) {
                switch (gesture) {
                    case GestureDetectorView.GESTURE_SLIDE_UP:
                        Toast.makeText(MainActivity.this, "up", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SLIDE_DOWN:
                        Toast.makeText(MainActivity.this, "down", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SLIDE_LEFT:
                        Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SLIDE_RIGHT:
                        Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SLIDE_LEFT_UP:
                        Toast.makeText(MainActivity.this, "left_up", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SLIDE_LEFT_DOWN:
                        Toast.makeText(MainActivity.this, "left_down", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SLIDE_RIGHT_UP:
                        Toast.makeText(MainActivity.this, "right_up", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SLIDE_RIGHT_DOWN:
                        Toast.makeText(MainActivity.this, "right_down", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SCALE_ZOOMIN:
                        Toast.makeText(MainActivity.this, "zoomin", Toast.LENGTH_SHORT).show();
                        break;
                    case GestureDetectorView.GESTURE_SCALE_ZOOMOUT:
                        Toast.makeText(MainActivity.this, "zoomout", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
