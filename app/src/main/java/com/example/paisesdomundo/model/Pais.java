package com.example.paisesdomundo.model;

import java.io.Serializable;

public class Pais implements Serializable {


    private int id;
    private String mNome;
    private String mCapital;
    private String mRegiao;
    private int mPopulacao;
    private float mLatitudeLongitude;
    private String mMoeda;
    private boolean visitar;

    //Gets and Setters------------------------------------------->

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmNome() {
        return mNome;
    }

    public void setmNome(String mNome) {
        this.mNome = mNome;
    }

    public String getmCapital() {
        return mCapital;
    }

    public void setmCapital(String mCapital) {
        this.mCapital = mCapital;
    }

    public String getmRegiao() {
        return mRegiao;
    }

    public void setmRegiao(String mRegiao) {
        this.mRegiao = mRegiao;
    }

    public int getmPopulacao() {
        return mPopulacao;
    }

    public void setmPopulacao(int mPopulacao) {
        this.mPopulacao = mPopulacao;
    }

    public float getmLatitudeLongitude() {
        return mLatitudeLongitude;
    }

    public void setmLatitudeLongitude(float mLatitudeLongitude) {
        this.mLatitudeLongitude = mLatitudeLongitude;
    }

    public String getmMoeda() {
        return mMoeda;
    }

    public void setmMoeda(String mMoeda) {
        this.mMoeda = mMoeda;
    }

    public boolean isVisitar() {
        return visitar;
    }

    public void setVisitar(boolean visitar) {
        this.visitar = visitar;
    }


    //Gets and Setters<-------------------------------------------


    //toString----------------------------->
    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", mNome='" + mNome + '\'' +
                ", mCapital='" + mCapital + '\'' +
                ", mRegiao='" + mRegiao + '\'' +
                ", mPopulacao=" + mPopulacao +
                ", mLatitudeLongitude=" + mLatitudeLongitude +
                ", mMoeda='" + mMoeda + '\'' +
                ", visitar=" + visitar +
                '}';
    }
    //toString<----------------------------
}
