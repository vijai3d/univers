package com.vijai.utils;

/**
 * Created by Victor on 22.03.2017.
 */
public enum StudentsStringUtils {
    MAIN_MENU("MAIN MENU"),
    SHOW_ALL_STUDENTS("SHOW ALL STUDENTS");
    
    private final String string;


    StudentsStringUtils(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }
}
