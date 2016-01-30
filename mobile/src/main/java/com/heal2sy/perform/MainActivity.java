package com.heal2sy.perform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.heal2sy.perform.fragment.TutoFragment;

public class MainActivity extends FragmentActivity {

    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new PagerAdapter(this.getSupportFragmentManager()));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });

    }

    public class PagerAdapter extends FragmentPagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment f = null;
            switch(position){
                case 0:
                    f =  TutoFragment.newInstance(R.string.text_tuto1, android.R.drawable.ic_menu_help);
                    break;
                case 1:
                    f =  TutoFragment.newInstance(R.string.text_tuto2, android.R.drawable.ic_delete);
                    break;
                case 2:
                    f =  TutoFragment.newInstance(R.string.text_tuto3, android.R.drawable.ic_dialog_email);
                    break;
            }
            return f;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
