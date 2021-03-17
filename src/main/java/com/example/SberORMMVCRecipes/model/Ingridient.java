package com.example.SberORMMVCRecipes.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Ingridient {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",
            strategy = "uuid")
    private String id;

    @Basic
    private String item;

    @Basic
    private Integer count;

    @Basic
    private String unit;

    public String getId() {
        return id;
    }

    public Ingridient() {
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item=item;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count=count;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit=unit;
    }
}
