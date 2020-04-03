package com.ribegroupe.promeocalculator;

import java.text.DecimalFormat;

public class Service {

    private double nb1;
    private double nb2;
    private String operator;

    public Service(double nb1, double nb2, String operator) {
        this.nb1 = nb1;
        this.nb2 = nb2;
        this.operator = operator;
    }

    public String calcul(){
        switch (operator){
            case "+":
                return plus();
            case "-":
                return minus();
            case "*":
                return multiple();
            case "/":
                return divide();
            case "%":
                return percent();
            default:
                return "";
        }
    }

    private String plus(){
        double nb = nb1 + nb2;
        return String.valueOf(nb);
    }
    private String minus(){
        double nb = nb1 - nb2;
        return String.valueOf(nb);
    }
    private String multiple(){
        double nb = nb1 * nb2;
        return String.valueOf(nb);
    }
    private String divide(){
        if(nb2 == 0){
            return "ERREUR";
        }else{
            double nb = nb1 / nb2;
            DecimalFormat nbdecimal = new DecimalFormat();
            nbdecimal.setMaximumFractionDigits(5);
            nb = Double.valueOf(nbdecimal.format(nb));
            return String.valueOf(nb);
        }
    }
    private String percent(){
        double nb = nb1 / 100;
        return String.valueOf(nb);
    }
}
