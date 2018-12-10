package com.example.shaun.dogshowad;

import android.os.Parcel;
import android.os.Parcelable;

public class Contestants implements Parcelable {


    private String name;
    private String categories;
    private String owners;
    private String aboutMe;
    private volatile int hash;

    public Contestants(String name, String categories, String owners, String aboutMe)
    {
        this.name = name;
        this.categories = categories;
        this.owners = owners;
        this.aboutMe = aboutMe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Contestants(Parcel in) {
        name = in.readString();
        categories = in.readString();
        owners = in.readString();
        aboutMe = in.readString();
    }

    public static final Creator<Contestants> CREATOR = new Creator<Contestants>() {
        @Override
        public Contestants createFromParcel(Parcel in) {
            return new Contestants(in);
        }

        @Override
        public Contestants[] newArray(int size) {
            return new Contestants[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(categories);
        dest.writeString(owners);
        dest.writeString(aboutMe);
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null)
        {
            return false;
        }

        if(!(obj instanceof Contestants))
        {
            return false;
        }

        Contestants that = (Contestants) obj;

        return (that.name.equalsIgnoreCase(name) &&
                that.categories.equalsIgnoreCase(categories) &&
                that.owners.equalsIgnoreCase(owners) &&
                that.aboutMe.equalsIgnoreCase(aboutMe));
    }

    @Override
    public int hashCode() {
        int result = hash;
        if(result == 0)
        {
            result = 17;
            result *=31 + name.hashCode();
            result *=31 + categories.hashCode();
            result *=31 + owners.hashCode();
            result *= 31 + aboutMe.hashCode();
            hash = result;
        }
        return result;
    }
}
