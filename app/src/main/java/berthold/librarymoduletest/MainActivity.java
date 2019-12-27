package berthold.librarymoduletest;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import berthold.testlibrary.SeekBarHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SeekBarHelper helper=new SeekBarHelper(5,20,10);
    }
}
