package support.fuchsia.awesometoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import support.fuchsia.animatedtoast.AnimatedToast;

public class MainActivity extends AppCompatActivity {
    Button success, failure, info, warning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        success = (Button) findViewById(R.id.success);
        failure = (Button) findViewById(R.id.failure);
        info = (Button) findViewById(R.id.info);
        warning = (Button) findViewById(R.id.warning);

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AnimatedToast.makeToast(MainActivity.this, "This is a sample success toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.SUCCESS, AnimatedToast.TOP).show();
            }
        });
        failure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AnimatedToast.makeToast(MainActivity.this, "This is a sample failure toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.FAILURE, AnimatedToast.BOTTOM).show();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AnimatedToast.makeToast(MainActivity.this, "This is a sample warning toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.WARNING, AnimatedToast.CENTER).show();
            }
        });
        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AnimatedToast.makeToast(MainActivity.this, "This is a sample info toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.INFO, AnimatedToast.TOP).show();
            }
        });

    }

}
