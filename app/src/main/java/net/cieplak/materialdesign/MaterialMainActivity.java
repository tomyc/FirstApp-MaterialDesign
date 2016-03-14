package net.cieplak.materialdesign;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MaterialMainActivity extends Activity {

    private ViewGroup viewGroup;
    private TextView textView;
    private ImageView imageView1,imageView2,imageView3;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_main);
        viewGroup = (ViewGroup)findViewById(R.id.view_group);
        textView = (TextView)findViewById(R.id.textView);
        imageView1 = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        button = (Button)findViewById(R.id.button);
        button.setText("OK");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(viewGroup,new Slide());
                toggle(textView,imageView1,imageView2,imageView3);
            }
        });
    }

    private static void toggle(View... views) {
    for (View v:views){
        boolean isVisible = v.getVisibility()==View.VISIBLE;
        v.setVisibility(isVisible?View.INVISIBLE:View.VISIBLE);
    }

    }
}
