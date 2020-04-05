package com.yaqin;

import java.util.*;

public class BookSeller {

    public static void sellBooks(){
        System.out.println("Value of a : "+Book.book1);
        System.out.println("Value of b : "+Book.book2);
        //return result;
    }

    public static void main(String[] args){

        BookSeller bs = new BookSeller();
        bs.sellBooks();

    }
}
