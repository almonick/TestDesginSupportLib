package android.example.com.testdesginsupportlib;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.support.v7.widget.Toolbar;



public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    TabLayout mTabLayout;
    AppBarLayout mAppBarlaout;


    private CoordinatorLayout mRootLayout;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mRootLayout = (CoordinatorLayout) findViewById(R.id.root_layout);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout);
        mCollapsingToolbarLayout.setTitle("Support Design Lib");


       // initTab();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mRootLayout, "Hello SanckBar", Snackbar.LENGTH_INDEFINITE).setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();

            }
        });
    }

    private void initTab() {
        mTabLayout = null;// (TabLayout) findViewById(R.id.tab_layout);
        if(mTabLayout == null) return;
        mTabLayout.setVisibility(View.VISIBLE);
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab A"), true);
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab B"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab C"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab D"));
       //mTabLayout.setupWithViewPager(mViewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
