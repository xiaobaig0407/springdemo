package com.laji;

public class GC {
    public static GC doStuff(){
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args){
        GC gc1;
        GC gc2 = new GC();
        GC[] mygc = {gc2,gc2,gc2};
        System.out.println(mygc);
        GC gc3 = new GC();
        System.out.println(gc3);
        GC gc4 = gc3;
        System.out.println(gc4);
        gc1 = doStuff();
        gc3 = gc2;
        System.out.println(gc2);
        System.out.println(gc3);
        System.out.println(gc4);
    }

    public static void doStuff2(GC copyGC){

    }
}
