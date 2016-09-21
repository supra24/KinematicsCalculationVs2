package com.example.damian.kinematicscalculationvs2.adapters;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import com.example.damian.kinematicscalculationvs2.R;
import com.example.damian.kinematicscalculationvs2.staticVolumes.KinematicsSImpleCustomView;

public class CustomListViewAdapterKinematicsSimple extends ArrayAdapter<String> {

    private final Context c;
    private LayoutInflater inflater;
//    DatabaseHelper databaseHelper = new DatabaseHelper(getContext());
//    ArrayList<KinematicsSimpleCustomView> kinematicsReverseCustomViews ;

    public CustomListViewAdapterKinematicsSimple(Context context /*ArrayList<String> data, ArrayList<Integer> images, ArrayList<String> volumes*/) {
        super(context, R.layout.custom_list_view_kinematics_simple, KinematicsSImpleCustomView.getTextTitle());

//        kinematicsReverseCustomViews = new ArrayList<>();
//        kinematicsReverseCustomViews = databaseHelper.getAll();
//
//        for (int i=0; i<kinematicsReverseCustomViews.size(); i++) {
//            Log.v("String", kinematicsReverseCustomViews.get(i).getTextTitle());
//        }

//        Log.v("custom list view", String.valueOf(allTitle.size()));
        this.c = context;
    }



    public class ListViewExample {
        ImageView img;
        TextView textTitle;
        TextView textFirst;
        TextView textSecond;
        TextView textThird;
        TextView textFourth;
        EditText editFirst;
        EditText editSecond;
        EditText editThird;
        EditText editFourth;
    }

    public View getView(final int position, View convertView, ViewGroup viewGroup) {

        if (convertView == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_list_view_kinematics_simple, null);
        }

        // our ListViewExample object
        final ListViewExample listViewExample = new ListViewExample();

        // initialize our views
        listViewExample.img = (ImageView) convertView.findViewById(R.id.imgCustomViewResultSimple);
        listViewExample.textTitle = (TextView) convertView.findViewById(R.id.textTitleSimple);
        listViewExample.textFirst = (TextView) convertView.findViewById(R.id.textFirstSimple);
        listViewExample.textSecond = (TextView) convertView.findViewById(R.id.textSecondSimple);
        listViewExample.textThird = (TextView) convertView.findViewById(R.id.textThirdSimple);
        listViewExample.textFourth = (TextView) convertView.findViewById(R.id.textFourthSimple);
        listViewExample.editFirst = (EditText) convertView.findViewById(R.id.editFirstSimple);
        listViewExample.editSecond = (EditText) convertView.findViewById(R.id.editSecondSimple);
        listViewExample.editThird = (EditText) convertView.findViewById(R.id.editThirdSimple);
        listViewExample.editFourth = (EditText) convertView.findViewById(R.id.editFourthSimple);

        // akcja na naciśięcie przycisku w otwaetej klawiaturze
        listViewExample.editFirst.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;

                if (i == EditorInfo.IME_ACTION_DONE) {
                    KinematicsSImpleCustomView.setEditFirst(position, String.valueOf(listViewExample.editFirst.getText().toString()));
                }
                return handled;
            }
        });

        listViewExample.editSecond.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;

                if (i == EditorInfo.IME_ACTION_DONE) {
                    KinematicsSImpleCustomView.setEditSecond(position, String.valueOf(listViewExample.editSecond.getText().toString()));
                }
                return handled;
            }
        });

        listViewExample.editThird.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;

                if (i == EditorInfo.IME_ACTION_DONE) {
                    KinematicsSImpleCustomView.setEditThird(position, String.valueOf(listViewExample.editThird.getText().toString()));
                }
                return handled;
            }
        });

        listViewExample.editFourth.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;

                if (i == EditorInfo.IME_ACTION_DONE) {
                    KinematicsSImpleCustomView.setEditFourth(position, String.valueOf(listViewExample.editFourth.getText().toString()));
                }
                return handled;
            }
        });

        //assign data
        listViewExample.img.setImageResource(KinematicsSImpleCustomView.getImage(position));
        listViewExample.textTitle.setText(KinematicsSImpleCustomView.getTextTitle(position));
        listViewExample.textFirst.setText(KinematicsSImpleCustomView.getTextFirst(position));
        listViewExample.textSecond.setText(KinematicsSImpleCustomView.getTextSecond(position));
        listViewExample.textThird.setText(KinematicsSImpleCustomView.getTextThird(position));
        listViewExample.textFourth.setText(KinematicsSImpleCustomView.getTextFourth(position));
        listViewExample.editFirst.setText(KinematicsSImpleCustomView.getEditFirst(position));
        listViewExample.editSecond.setText(KinematicsSImpleCustomView.getEditSecond(position));
        listViewExample.editThird.setText(KinematicsSImpleCustomView.getEditThird(position));
        listViewExample.editFourth.setText(KinematicsSImpleCustomView.getEditFourth(position));

        if (KinematicsSImpleCustomView.getTextFourth(position).equals("")){
            listViewExample.textFourth.setVisibility(View.INVISIBLE);
            listViewExample.editFourth.setVisibility(View.INVISIBLE);
        } else {
            listViewExample.textFourth.setVisibility(View.VISIBLE);
            listViewExample.editFourth.setVisibility(View.VISIBLE);
        }


//        Collections.reverse(kinematicsReverseCustomViews);

//        listViewExample.img.setImageResource(kinematicsReverseCustomViews.get(position).getImages());
//        listViewExample.textTitle.setText(kinematicsReverseCustomViews.get(position).getTextTitle());
//        listViewExample.textFirst.setText(kinematicsReverseCustomViews.get(position).getTextFirst());
//        listViewExample.textSecond.setText(kinematicsReverseCustomViews.get(position).getTextSecond());
//        listViewExample.textThird.setText(kinematicsReverseCustomViews.get(position).getTextThird());
//        listViewExample.textFourth.setText(kinematicsReverseCustomViews.get(position).getTextFourth());
//        listViewExample.editFirst.setText(kinematicsReverseCustomViews.get(position).getEditFirst());
//        listViewExample.editSecond.setText(kinematicsReverseCustomViews.get(position).getEditSecond());
//        listViewExample.editThird.setText(kinematicsReverseCustomViews.get(position).getEditThird());
//        listViewExample.editFourth.setText(kinematicsReverseCustomViews.get(position).getEditFourth());
//
//        if (kinematicsReverseCustomViews.get(position).getTextFourth().equals("")){
//            listViewExample.textFourth.setVisibility(View.INVISIBLE);
//            listViewExample.editFourth.setVisibility(View.INVISIBLE);
//        } else {
//            listViewExample.textFourth.setVisibility(View.VISIBLE);
//            listViewExample.editFourth.setVisibility(View.VISIBLE);
//        }

//        Collections.reverse(kinematicsReverseCustomViews);

//        listViewExample.img.setImageResource(KinematicsSImpleCustomView.getImages(position));
//        listViewExample.name.setText(KinematicsSImpleCustomView.getMembers(position));
//        listViewExample.dat.setText(KinematicsSImpleCustomView.getData(position));
//        listViewExample.text.setText(KinematicsSImpleCustomView.getVolume(position));

//        Log.v("Custom List Result", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return convertView;
    }
}
