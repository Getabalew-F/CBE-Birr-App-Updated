package com.example.navdrawerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChangePIN extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Button callForMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pin);
        drawerLayout = findViewById(R.id.drawer_layout);

        callForMain = findViewById(R.id.change_pinn);
        callForMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangePIN.this,Login.class);
                startActivity(intent);
            }
        });
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
        recreate();
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