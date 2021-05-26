package com.example.demo;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Alien
{
    @Id
    private int aid ;
    private String aname;

    public int getAid(){
        return aid;
    }
    public void setAid(){
        this.aid=aid;
    }
    public String getAname(){
        return aname;
    }
    public void setAname(String aname){
        this.aname=aname;
    }
    @Override
    public String toString(){
        return "Alien[aid=" +aid +" , aname =" + aname +"]";
    }
}
