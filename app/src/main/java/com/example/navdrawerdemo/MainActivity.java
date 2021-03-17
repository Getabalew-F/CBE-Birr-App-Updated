package com.example.navdrawerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        imageButton = (ImageButton) findViewById(R.id.imagbtn1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransferInput.class);
                startActivity(intent);
            }
        });

        imageButton2 = (ImageButton) findViewById(R.id.imgbtn2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PayBillInput.class);
                startActivity(intent);
            }
        });
        imageButton3 = (ImageButton) findViewById(R.id.imagbtn3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AirtimeInput.class);
                startActivity(intent);
            }
        });
        imageButton4 = (ImageButton) findViewById(R.id.imagbtn4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CashOutInput.class);
                startActivity(intent);
            }
        });
    }

    public void ClickMenu(View view) {
        openDrawer(this.drawerLayout);
    }


    public void ClickLogo(View view) {
        closeDrawer(this.drawerLayout);
    }


    public static void openDrawer(DrawerLayout drawerLayout2) {
        drawerLayout2.openDrawer((int) GravityCompat.START);
    }



    public static void closeDrawer(DrawerLayout drawerLayout2) {
        if (drawerLayout2.isDrawerOpen((int) GravityCompat.START)) {
            drawerLayout2.closeDrawer((int) GravityCompat.START);
        }
    }

    public void ClickHome(View view) {
        recreate();
    }

    public void ClickMiniStatement(View view) {
        redirectActivity(this, MiniStatement.class);
    }

    public void ClickChangePIN(View view) {
        redirectActivity(this, ChangePIN.class);
    }

    public void ClickManageBeneficiary(View view) {redirectActivity(this, ManageBeneficiary.class);}

    public void ClickManageBill(View view) {
        redirectActivity(this, ManageBill.class);
    }

    public void ClickChangeLanguage(View view) {
        redirectActivity(this, ChangeLanguage.class);
    }

    public void ClickLogout(View view) {
        logout(this);
    }

    public static void logout(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout ?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAffinity();
                System.exit(0);
            }

        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity, aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        closeDrawer(this.drawerLayout);
    }
}