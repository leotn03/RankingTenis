package torleo.example.com.rankingtenis;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    public static final String EXTRA_REFERENCE = "reference";
    public static final String EXTRA_SHOW = "show";

    public static final String KEY_MAIL = "KEY_MAIL";
    public static final String KEY_FIRSTNAME = "KEY_FIRSTNAME";
    public static final String KEY_LASTNAME = "KEY_LASTNAME";
    public static final String KEY_PROFILE_PIC = "KEY_PROFILE_PIC";
    public static final String KEY_LOGIN = "KEY_LOGIN";
    public static final String KEY_METHOD = "KEY_METHOD";

    private Male signIn;
    private Female signUp;

    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link android.support.v4.view.ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    /**
     * This method creates the activity Login
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signIn = new Male();
        signUp = new Female();

        signIn.setContext(getBaseContext());
        signUp.setContext(getBaseContext());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    /**
     * Sets the menu to the Login activity
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    /************************************** On Clicks ********************************************/
    /**
     * On click method for the Forgot password TextField
     *
     * @param view
     */
    public void onClickForPassword(View view) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, Uri.parse("lostpassword"));
        startActivity(intent);
    }


    /************************************** Others ************************************************/
    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    return signIn;
                case 1:
                    return signUp;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Sign in";
                case 1:
                    return "Sign up";
            }
            return null;
        }
    }
}