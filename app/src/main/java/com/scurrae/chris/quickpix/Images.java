package com.scurrae.chris.quickpix;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;

import java.io.ByteArrayOutputStream;

/**
 * Created by chris on 3/21/16.
 */
public class Images {
    int _id;
    Bitmap _image;

    // Empty constructor
    public Images(){

    }

    // Constructor with id and image as parameters
    public Images(Bitmap image){
        this._image = image;
    }
    // Constructor with id and image as parameters
    public Images(int id, Bitmap image){
        this._id = id;
        this._image = image;
    }

    public byte[] getBArray(Bitmap i){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        i.compress(Bitmap.CompressFormat.PNG, 100, baos);
        i.recycle();
        return baos.toByteArray();
    }
    public Bitmap getBitmap(byte[] i){
        Bitmap bitmap = BitmapFactory.decodeByteArray(i, 0, i.length);
        return bitmap;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Bitmap get_image() {
        return _image;
    }

    public void set_image(Bitmap _image) {
        this._image = _image;
    }
}
