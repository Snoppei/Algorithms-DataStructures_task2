package com.company;

public class ToStringConverter {
    public static String[] simpleLinkedListToString(SimpleLinkedList list) throws SimpleLinkedList.SimpleLinkedListException {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += (i > 0 ? ", " : "") + list.get(i);
        }
        String[] values = str.split(", ");
        return values;
    }

    public static SimpleLinkedList stringToSimpleLinkedList(String str) {
        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        String[] splittedStr = str.split(", ");
        for(int i = 0; i < splittedStr.length; i++) {
            list.addLast(splittedStr[i]);
        }
        return list;
    }

    public static SimpleLinkedList stringToSimpleLinkedList(String[] str) {
        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        //String[] splittedStr = str.split(", ");
        for(int i = 0; i < str.length; i++) {
            list.addLast(str[i]);
        }
        return list;
    }

/*    public static SimpleLinkedList stringToSimpleLinkedList(String str) {
        //SimpleLinkedList<>
    }*/
}
