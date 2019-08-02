package com.example.alisubmission;

import android.os.Parcel;
import android.os.Parcelable;

public class Shikigami implements Parcelable {

    private String nama, remarks, photo, bio, attack, hp, def;

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public Shikigami(){

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.bio);
        dest.writeString(this.attack);
        dest.writeString(this.hp);
        dest.writeString(this.def);
    }

    protected Shikigami(Parcel in) {
        this.nama = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.bio = in.readString();
        this.attack = in.readString();
        this.hp = in.readString();
        this.def = in.readString();
    }

    public static final Creator<Shikigami> CREATOR = new Creator<Shikigami>() {
        @Override
        public Shikigami createFromParcel(Parcel in) {
            return new Shikigami(in);
        }

        @Override
        public Shikigami[] newArray(int size) {
            return new Shikigami[size];
        }
    };
}
