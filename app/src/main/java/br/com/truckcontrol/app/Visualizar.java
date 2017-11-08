package br.com.truckcontrol.app;

import com.orm.SugarRecord;

/**
 * Created by 16254858 on 06/11/2017.
 */

public class Visualizar extends SugarRecord{

    private String mes;
    private int km;

    //construtores obrigatorios por causa do orm
    public  Visualizar(){}

    public Visualizar(String mes,int km){

        this.mes = mes;
        this.km = km;
    }


    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
