package com.example.damian.kinematicscalculationvs2.staticVolumes;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Damian on 2016-08-15.
 */
public class KinematicsSImpleCustomView {

    private static ArrayList<Integer> images = new ArrayList<>();
    private static ArrayList<String> textTitle = new ArrayList<>();
    private static ArrayList<String> textFirst = new ArrayList<>();
    private static ArrayList<String> editFirst = new ArrayList<>();
    private static ArrayList<String> textSecond = new ArrayList<>();
    private static ArrayList<String> editSecond = new ArrayList<>();
    private static ArrayList<String> textThird = new ArrayList<>();
    private static ArrayList<String> editThird = new ArrayList<>();
    private static ArrayList<String> textFourth = new ArrayList<>();
    private static ArrayList<String> editFourth = new ArrayList<>();

    //----------------------------------------------
    public static int getImage(int i) {
        return images.get(i);
    }

    public static ArrayList<Integer> getImage() {
        return images;
    }

    public static String getTextTitle(int i) {
        return textTitle.get(i);
    }

    public static ArrayList<String> getTextTitle() {
        return textTitle;
    }

    //----------------------------------------------
    public static String getTextFirst(int i) {
        return textFirst.get(i);
    }

    public static ArrayList<String> getTextFirst() {
        return textFirst;
    }

    public static String getEditFirst(int i) {
        return editFirst.get(i);
    }

    public static ArrayList<String> getEditFirst() {
        return editFirst;
    }

    //-------------------------------------------------
    public static String getTextSecond(int i) {
        return textSecond.get(i);
    }

    public static ArrayList<String> getTextSecond() {
        return textSecond;
    }

    public static String getEditSecond(int i) {
        return editSecond.get(i);
    }

    public static ArrayList<String> getEditSecond() {
        return editSecond;
    }

    //--------------------------------------------------
    public static String getTextThird(int i) {
        return textThird.get(i);
    }

    public static ArrayList<String> getTextThird() {
        return textThird;
    }

    public static String getEditThird(int i) {
        return editThird.get(i);
    }

    public static ArrayList<String> getEditThird() {
        return editThird;
    }

    //---------------------------------------------------
    public static String getTextFourth(int i) {
        return textFourth.get(i);
    }

    public static ArrayList<String> getTextFourth() {
        return textFourth;
    }

    public static String getEditFourth(int i) {
        return editFourth.get(i);
    }

    public static ArrayList<String> getEditFourth() {
        return editFourth;
    }
    //---------------------------------------------------

    //---------------------------------------------------
    public static void setImages(int i) {
        images.add(new Integer(i));
    }

    public static void setTextTitle(String s) {
        textTitle.add(new String(s));
    }

    public static void setTextFirst(String s) {
        textFirst.add(new String(s));
    }

    public static void setEditFirst(String s) {
        editFirst.add(new String(s));
    }

    public static void setTextSecond(String s) {
        textSecond.add(new String(s));
    }

    public static void setEditSecond(String s) {
        editSecond.add(new String(s));
    }

    public static void setTextThird(String s) {
        textThird.add(new String(s));
    }

    public static void setEditThird(String s) {
        editThird.add(new String(s));
    }

    public static void setTextFourth(String s) {
        textFourth.add(new String(s));
    }

    public static void setEditFourth(String s) {
        editFourth.add(new String(s));
    }

    // --------------------------------------------------
    public static void setTextTitle(int position, String s) {
        textTitle.set(position, s);
    }

    public static void setEditFirst(int position, String s) {
        editFirst.set(position, s);
    }

    public static void setEditSecond(int position, String s) {
        editSecond.set(position, s);
    }

    public static void setEditThird(int position, String s) {
        editThird.set(position, s);
    }

    public static void setEditFourth(int position, String s) {
        editFourth.set(position, s);
    }
    //---------------------------------------------------

    public static void reverseAllObject() {

        Collections.reverse(images);
        Collections.reverse(textTitle);
        Collections.reverse(textFirst);
        Collections.reverse(editFirst);
        Collections.reverse(textSecond);
        Collections.reverse(editSecond);
        Collections.reverse(textThird);
        Collections.reverse(editThird);
        Collections.reverse(textFourth);
        Collections.reverse(editFourth);
    }

    public static void undoResult(){

        reverseAllObject();
        int i = images.size()-1;
        images.remove(i);
        textTitle.remove(i);
        textFirst.remove(i);
        editFirst.remove(i);
        textSecond.remove(i);
        editSecond.remove(i);
        textThird.remove(i);
        editThird.remove(i);
        textFourth.remove(i);
        editFourth.remove(i);
        reverseAllObject();

    }
}
