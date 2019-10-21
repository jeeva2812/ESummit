package com.example.e_summit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    CarouselView MainCarouselView,Day1CarouselView,Day2CarouselView,Day3CarouselView;

    int[] MainEvents = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
    int[] Day1Events = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
    int[] Day2Events = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
    int[] Day3Events = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainCarouselView = findViewById(R.id.MainCarouselView);
        MainCarouselView.setPageCount(MainEvents.length);
        MainCarouselView.setImageListener(MainEventsListener);

        Day1CarouselView = findViewById(R.id.Day1CarouselView);
        Day1CarouselView.setPageCount(Day1Events.length);
        Day1CarouselView.setImageListener(Day1EventsListener);

        Day2CarouselView = findViewById(R.id.Day2CarouselView);
        Day2CarouselView.setPageCount(Day2Events.length);
        Day2CarouselView.setImageListener(Day2EventsListener);

        Day3CarouselView = findViewById(R.id.Day3CarouselView);
        Day3CarouselView.setPageCount(Day3Events.length);
        Day3CarouselView.setImageListener(Day3EventsListener);

    }

    ImageListener MainEventsListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(MainEvents[position]);
        }
    };

    ImageListener Day1EventsListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(Day1Events[position]);
        }
    };

    ImageListener Day2EventsListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(Day2Events[position]);
        }
    };

    ImageListener Day3EventsListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(Day3Events[position]);
        }
    };
}
