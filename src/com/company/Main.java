package com.company;

import java.util.Locale;

public class Main {

    public static void winMain() throws Exception {
        //SwingUtils.setLookAndFeelByName("Windows");
        Locale.setDefault(Locale.ROOT);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    public static void main(String[] args) throws Exception {
        winMain();

        /*String[] str;

        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        list.addFirst("20");
        list.addFirst("10");
        list.addLast("30");
        list.addLast("40");
        list.addLast("1");
        list.addFirst("-1");

        for (int i = 0; i < list.size(); i++) {
            System.out.print((i > 0 ? ", " : "") + list.get(i));
        }
        System.out.println();

*//*        for (int i = 0; i < list.size(); i++) {
            str[i] += (i > 0 ? ", " : "") + list.get(i);
        }*//*

*//*
        int[] b = ArrayUtils.toIntArray(str);

        for(int i = 0; i < list.size(); i++){
            System.out.print((i > 0 ? ", " : "") + b[i]);
        }
        System.out.println();*//*



        SimpleLinkedList<String> newList = list.Shuffle();

        for (int i = 0; i < newList.size(); i++) {
            System.out.print((i > 0 ? ", " : "") + newList.get(i));
        }
        System.out.println();
        int[] arr = new int[newList.size()];

        newList.addLast("20");
        str = ToStringConverter.simpleLinkedListToString(newList);
        for(String value : str ) {
            System.out.println(value);
        }*/
    }
}
