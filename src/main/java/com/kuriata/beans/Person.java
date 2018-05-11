package com.kuriata.beans;

public class Person extends BaseEntity{
    private ROLE role;

    public enum  ROLE{
        ADMIN, STUDENT
    }
}
