package phamtanphat.ptp.khoaphamtraining.checkboradiobutton04102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    CheckBox mCbAndroid,mCbiOS,mCbPhp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCbAndroid = findViewById(R.id.checkboxAndroid);
        mCbiOS = findViewById(R.id.checkboxios);
        mCbPhp = findViewById(R.id.checkboxPhp);

        mCbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!b) return;
                mCbiOS.setChecked(false);
                mCbPhp.setChecked(false);
            }
        });
        mCbiOS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!b) return;
                mCbAndroid.setChecked(false);
                mCbPhp.setChecked(false);
            }
        });
        mCbPhp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!b) return;
                mCbAndroid.setChecked(false);
                mCbiOS.setChecked(false);
            }
        });
    }
}
