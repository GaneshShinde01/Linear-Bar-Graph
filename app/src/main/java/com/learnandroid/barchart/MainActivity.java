package com.learnandroid.barchart;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Get the bars from the layout
        View bar1 = findViewById(R.id.bar1);
        View bar2 = findViewById(R.id.bar2);
        View bar3 = findViewById(R.id.bar3);
        View bar4 = findViewById(R.id.bar4);
        View bar5 = findViewById(R.id.bar5);

        // Define the heights for each bar
        int[] barHeights = {100, 200, 150, 250, 180};

        // Set the height for each bar dynamically
        setBarHeight(bar1, barHeights[0]);
        setBarHeight(bar2, barHeights[1]);
        setBarHeight(bar3, barHeights[2]);
        setBarHeight(bar4, barHeights[3]);
        setBarHeight(bar5, barHeights[4]);
    }

    private void setBarHeight(View bar, int height) {
        // Set the height of the bar in dp
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) bar.getLayoutParams();
        params.height = dpToPx(height);
        bar.setLayoutParams(params);
    }

    // Convert dp to pixels
    private int dpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }
}