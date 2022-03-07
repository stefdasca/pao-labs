package com.company;

public class Truth {
    private static String facts;
    private static Truth adevar;

    private Truth(){
        facts = "Stiu sa predau algoritmica";
    }

    public static Truth getTruth(){
        if(adevar == null)
            adevar = new Truth();
        return adevar;
    }

    public static void showTruth(){
        System.out.println("Doresc sa te anunt ca " + facts);
    }
}
