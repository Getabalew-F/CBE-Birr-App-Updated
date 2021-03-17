package com.example.navdrawerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class MiniStatement extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_statement);

        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view) {
        MainActivity.openDrawer(this.drawerLayout);
    }

    public void ClickLogo(View view) {
        MainActivity.closeDrawer(this.drawerLayout);
    }

    public void ClickHome(View view) {
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickMiniStatement(View view) {
        recreate();
    }

    public void ClickChangePIN(View view) {
        MainActivity.redirectActivity(this, ChangePIN.class);
    }

    public void ClickManageBeneficiary(View view) {
        MainActivity.redirectActivity(this, ManageBeneficiary.class);
    }

    public void ClickManageBill(View view) {
        MainActivity.redirectActivity(this, ManageBill.class);
    }

    public void ClickChangeLanguage(View view) {
        MainActivity.redirectActivity(this, ChangeLanguage.class);
    }

    public void ClickLogout(View view) {
        MainActivity.logout(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MainActivity.closeDrawer(this.drawerLayout);
    }
}

