package com.cntr.msc;

public class Client {
    public static void main(String[] args) {
        StrumentiMusicali strumentiLucry = new StrumentiMusicali("Lucry");
        strumentiLucry.add(new Chitarra());
        strumentiLucry.add(new Flauto());
        strumentiLucry.add(new Chitarra());
        strumentiLucry.add(new Pianoforte());
        // strumentiLucry.print();

        StrumentiMusicali strumentiCharly = new StrumentiMusicali("Charly");
        strumentiCharly.add(new Chitarra());
        strumentiCharly.add(new Pianoforte());
        strumentiCharly.add(strumentiLucry);
        strumentiCharly.print();

    }
}
