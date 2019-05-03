package com.ghina.pahlawanku;

import android.os.Parcel;
import android.os.Parcelable;

public class Pahlawan implements Parcelable {
    private String name;
    private String description;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeInt(this.photo);
    }

    public Pahlawan() {
    }

    protected Pahlawan(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.photo = in.readInt();
    }

    public static final Parcelable.Creator<Pahlawan> CREATOR = new Parcelable.Creator<Pahlawan>() {
        @Override
        public Pahlawan createFromParcel(Parcel source) {
            return new Pahlawan(source);
        }

        @Override
        public Pahlawan[] newArray(int size) {
            return new Pahlawan[size];
        }
    };
}
