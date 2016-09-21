package com.example.damian.kinematicscalculationvs2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.damian.kinematicscalculationvs2.R;
import com.example.damian.kinematicscalculationvs2.fragments.SimpleDeclarationListResult;
import com.example.damian.kinematicscalculationvs2.staticVolumes.KinematicsSImpleCustomView;

/**
 * Created by Damian on 2016-09-21.
 */
public class KinematicsSimple extends AppCompatActivity {

    private SimpleDeclarationListResult simpleDeclarationListResult;
    private boolean doubleBackToExitPressedOnce = false;
    private static int CLOSE_APP_ON_BACK = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kinematics_simple);

//        DatabaseHelper databaseHelper = new DatabaseHelper(getBaseContext());
//        databaseHelper.removeAll();
//        Log.v("ilosc w bazie", String.valueOf(databaseHelper.getAllTitle().size()));

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButtonSimple);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                registerForContextMenu(fab);
                openContextMenu(fab);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_popout_action_floating_button, menu);

        if (!KinematicsSImpleCustomView.getTextTitle().isEmpty()) {

            KinematicsSImpleCustomView.reverseAllObject();

            if (KinematicsSImpleCustomView.getTextTitle(KinematicsSImpleCustomView.getTextTitle().size() - 1).equals("Effector")) {
                menu.findItem(R.id.id_connector_linear).setVisible(false);
                menu.findItem(R.id.id_rotary_horizontally).setVisible(false);
                menu.findItem(R.id.id_rotary_vertically).setVisible(false);
                menu.findItem(R.id.id_effector).setVisible(false);
                menu.findItem(R.id.id_end).setVisible(true);
                menu.findItem(R.id.id_undo).setVisible(true);
            } else {
                menu.findItem(R.id.id_connector_linear).setVisible(true);
                menu.findItem(R.id.id_rotary_horizontally).setVisible(true);
                menu.findItem(R.id.id_rotary_vertically).setVisible(true);
                menu.findItem(R.id.id_effector).setVisible(true);
                menu.findItem(R.id.id_end).setVisible(false);
                menu.findItem(R.id.id_undo).setVisible(true);
            }

            KinematicsSImpleCustomView.reverseAllObject();
        } else {
            menu.findItem(R.id.id_connector_linear).setVisible(true);
            menu.findItem(R.id.id_rotary_horizontally).setVisible(true);
            menu.findItem(R.id.id_rotary_vertically).setVisible(true);
            menu.findItem(R.id.id_effector).setVisible(true);
            menu.findItem(R.id.id_end).setVisible(false);
            menu.findItem(R.id.id_undo).setVisible(false);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        simpleDeclarationListResult = (SimpleDeclarationListResult) getSupportFragmentManager().findFragmentById(R.id.draw_item_declaration_simple);

        if (simpleDeclarationListResult != null) {
            switch (item.getItemId()) {
                case R.id.id_connector_linear:
                    simpleDeclarationListResult.updateResult(2);
                    break;
                case R.id.id_rotary_horizontally:
                    simpleDeclarationListResult.updateResult(1);
                    break;
                case R.id.id_rotary_vertically:
                    simpleDeclarationListResult.updateResult(0);
                    break;
                case R.id.id_effector:
                    simpleDeclarationListResult.updateResult(3);
                    break;
                case R.id.id_undo:
                    simpleDeclarationListResult.undoResult();
                    break;
                case R.id.id_end:
                    startActivity(new Intent(KinematicsSimple.this, KinematicsSimpleDraw.class));
                    break;
                default:
                    return true;
            }
        } else {
            Toast.makeText(this, "Error Sending Message", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    public void onBackPressed() {

//        if (simpleDeclarationListResult == null) {
//            simpleDeclarationListResult = (SimpleDeclarationListResult) getSupportFragmentManager().findFragmentById(R.id.draw_item_declaration);
//        }

        if (KinematicsSImpleCustomView.getTextTitle().isEmpty()){

            if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                getSupportFragmentManager().popBackStack();
            } else if (!doubleBackToExitPressedOnce) {
                this.doubleBackToExitPressedOnce = true;
                Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        doubleBackToExitPressedOnce = false;
                    }
                }, CLOSE_APP_ON_BACK);
            } else {
                super.onBackPressed();
            }
        } else {
            simpleDeclarationListResult.undoResult();
        }
    }
}
