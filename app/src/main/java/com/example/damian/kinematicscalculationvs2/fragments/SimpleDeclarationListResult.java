package com.example.damian.kinematicscalculationvs2.fragments;

import android.view.View;
import android.widget.ListView;

import com.example.damian.kinematicscalculationvs2.R;
import com.example.damian.kinematicscalculationvs2.adapters.CustomListViewAdapterKinematicsSimple;
import com.example.damian.kinematicscalculationvs2.staticVolumes.KinematicsSImpleCustomView;

public class SimpleDeclarationListResult extends FragmentParent {

    private String[] textFIrst = {
            "a = ", "a = ", "a = ", "x = "
    };

    private String[] textSecond = {
            "α = ", "α = ", "α = ", "y = "
    };

    private String[] textThird = {
            "d = ", "d = ", "d = ", "z = "
    };

    private String[] textFourth = {
            "θ = ", "θ = ", "θ = ", ""
    };

    private String[] title = {
            "Rotary Vertically", "Rotary Horizontally", "Connector Linear", "Effector"
    };

    private int[] images = {
            R.drawable.rotary_vertically, R.drawable.rotary_horizontally, R.drawable.connector_linear, R.drawable.line_vertically
    };

    private CustomListViewAdapterKinematicsSimple customListViewAdapterKinematicsSimple;

    public SimpleDeclarationListResult() {
        layoutid = R.layout.simple_declaration_result;
    }

    @Override
    public void init(View view) {

//        DatabaseHelper databaseHelper = new DatabaseHelper(getContext());
//        ArrayList<String> strings = databaseHelper.getAllTitle();

        customListViewAdapterKinematicsSimple = new CustomListViewAdapterKinematicsSimple(this.getContext() /*, SimpleDeclarationVolumes.getMembers(), SimpleDeclarationVolumes.getData(), SimpleDeclarationVolumes.getImages(), SimpleDeclarationVolumes.getVolume()*/);

        ListView listView = (ListView) view.findViewById(R.id.listVieResultKinematicsSimple);
        listView.setAdapter(customListViewAdapterKinematicsSimple);
//        Log.v("SimpleDeclarationResult", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    }

    public void updateResult(int position) {

//        KinematicsSImpleCustomView.reverseAllObject();
//        KinematicsSImpleCustomView.setMember(members[position]);
//        KinematicsSImpleCustomView.setData(data[position]);
//        KinematicsSImpleCustomView.setImage(images[position]);
//        KinematicsSImpleCustomView.setVolume(String.valueOf(0));
//        KinematicsSImpleCustomView.reverseAllObject();

        KinematicsSImpleCustomView.reverseAllObject();
        KinematicsSImpleCustomView.setImages(images[position]);
        KinematicsSImpleCustomView.setTextTitle(title[position]);
        KinematicsSImpleCustomView.setTextFirst(textFIrst[position]);
        KinematicsSImpleCustomView.setTextSecond(textSecond[position]);
        KinematicsSImpleCustomView.setTextThird(textThird[position]);
        KinematicsSImpleCustomView.setTextFourth(textFourth[position]);
        KinematicsSImpleCustomView.setEditFirst(String.valueOf(0));
        KinematicsSImpleCustomView.setEditSecond(String.valueOf(0));
        KinematicsSImpleCustomView.setEditThird(String.valueOf(0));
        KinematicsSImpleCustomView.setEditFourth(String.valueOf(0));
        KinematicsSImpleCustomView.reverseAllObject();

        customListViewAdapterKinematicsSimple.notifyDataSetInvalidated();

//        DatabaseHelper databaseHelper = new DatabaseHelper(getContext());
//        KinematicsSimpleCustomView kinematicsSimpleCustomView = new KinematicsSimpleCustomView();
//        kinematicsSimpleCustomView.setImages(images[position]);
//        kinematicsSimpleCustomView.setTextTitle(title[position]);
//        kinematicsSimpleCustomView.setTextFirst(textFIrst[position]);
//        kinematicsSimpleCustomView.setTextSecond(textSecond[position]);
//        kinematicsSimpleCustomView.setTextThird(textThird[position]);
//        kinematicsSimpleCustomView.setTextFourth(textFourth[position]);
//        kinematicsSimpleCustomView.setEditFirst(String.valueOf(0));
//        kinematicsSimpleCustomView.setEditSecond(String.valueOf(0));
//        kinematicsSimpleCustomView.setEditThird(String.valueOf(0));
//        kinematicsSimpleCustomView.setEditFourth(String.valueOf(0));
//        databaseHelper.insertDataBase(kinematicsSimpleCustomView);
//
//        customListViewAdapterKinematicsSimple.notifyDataSetInvalidated();
//
//        ArrayList<KinematicsSimpleCustomView> k = databaseHelper.getAll();
//
//
//        for (int i=0; i<k.size(); i++) {
////            KinematicsSimpleCustomView kinematicsSimpleCustomView1 = databaseHelper.getKinematicsSimpleCustomView(i);
////            Log.v("String 2", kinematicsSimpleCustomView1.getTextTitle());
////            Log.v("String 2", k.get(i).getTextTitle());
//        }
//
//        init(getView());
//        Log.v("data base", String.valueOf(databaseHelper.getAll().size()));
//        init(getView());
    }

    public void undoResult() {

        KinematicsSImpleCustomView.undoResult();
        init(getView());
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

}
