package basiclayout.sample.harshit.basicswipelayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity{
    ViewPager mPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPager = (ViewPager) findViewById(R.id.frame);
        mPager.setOffscreenPageLimit(1);
        mPager.setAdapter(new EndlessAdapter(this, mImageArray));
    }

    private int[] mImageArray = { R.drawable.a, R.drawable.a1, R.drawable.a2,
            R.drawable.a3 };
}
