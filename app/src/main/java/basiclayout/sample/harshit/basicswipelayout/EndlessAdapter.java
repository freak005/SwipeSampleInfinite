package basiclayout.sample.harshit.basicswipelayout;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by freak005 on 12/18/15.
 */
public class EndlessAdapter extends PagerAdapter {
    MainActivity activity;
    int imageArray[];

    public EndlessAdapter(MainActivity act, int[] imgArra) {
        imageArray = imgArra;
        activity = act;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View) object);
    }
    private int pos = 0;

    public Object instantiateItem(View collection, int position) {

        ImageView mwebView = new ImageView(activity);
        ((ViewPager) collection).addView(mwebView, 0);
        mwebView.setScaleType(ImageView.ScaleType.FIT_XY);
        mwebView.setImageResource(imageArray[pos]);

        if (pos >= imageArray.length - 1)
            pos = 0;
        else
            ++pos;

        return mwebView;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
    @Override
    public void destroyItem(View arg0, int arg1, Object arg2) {
        ((ViewPager) arg0).removeView((View) arg2);
    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}
