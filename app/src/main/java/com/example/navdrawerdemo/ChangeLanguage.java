package com.example.navdrawerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ChangeLanguage extends AppCompatActivity {
    DrawerLayout drawerLayout;
    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);

        autoCompleteTextView = findViewById(R.id.language1);
        String[] option = {"English","አማርኛ","ትግርኛ", "Afan Oromoo","Soomaali","Qfara"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.language, option);
        autoCompleteTextView.setText(arrayAdapter.getItem(0).toString(), false);
        autoCompleteTextView.setAdapter(arrayAdapter);

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
        MainActivity.redirectActivity(this, MiniStatement.class);
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
        recreate();
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