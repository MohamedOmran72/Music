package com.example.music.ui.activity.home;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.music.R;
import com.example.music.ui.activity.BaseActivity;
import com.example.music.ui.fragment.home.FavoritesFragment;
import com.example.music.ui.fragment.home.PlaylistsFragment;
import com.example.music.ui.fragment.home.RecentFragment;
import com.example.music.ui.fragment.home.StoreFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.frame_home_fragment_container)
    FrameLayout frameHomeFragmentContainer;
    @BindView(R.id.bottom_home)
    BottomNavigationView bottomHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        BottomNavigationView bottomNavigationView = bottomHome;
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        //Start layout with home fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_home_fragment_container,
                new RecentFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.navigation_recent);
    }

    //Add navigation selected listener
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()){
                        case R.id.navigation_recent:
                            selectedFragment = new RecentFragment();
                            break;

                        case R.id.navigation_favorites:
                            selectedFragment = new FavoritesFragment();
                            break;

                        case R.id.navigation_playlists:
                            selectedFragment = new PlaylistsFragment();
                            break;

                        case R.id.navigation_music_store:
                            selectedFragment = new StoreFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_home_fragment_container,
                            selectedFragment).commit() ;

                    return true;
                }
            };
}
