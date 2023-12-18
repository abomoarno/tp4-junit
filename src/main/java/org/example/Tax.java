package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tax {

    Employe emp;

    public Tax(Employe emp) {
        this.emp = emp;
    }


    public double calculTax(){

        double taux;

        if (emp.getBrute() >= 60000.0){
            taux = .15;
        } else if (emp.getBrute() >= 45000.0) {
            taux = .1;
        } else if (emp.getBrute() >= 35000){
            taux = .075;
        } else {
            taux = 0.0;
        }

        double reduction;

        if ((taux > 0.0) &&( emp.getEnfant() > 0)){
            reduction = 0.025;
        } else {
            reduction = 0.0;
        }

        return BigDecimal.valueOf(emp.getBrute() * (taux - reduction)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}
