package com.example.SberORMMVCRecipes.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Recept {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",
            strategy = "uuid")
    private String id;

    @Basic
    private String name;

    @Basic
    private Integer categoryReceptId;

    @Basic
    private String description;

    @OneToMany
    @JoinColumn(name = "CATEGIRYRECEPT_ID")
    private CategoryRecept categoryRecept;

    @ElementCollection
    @CollectionTable(
            name="INGRIDIENT_LIST",
            joinColumns=@JoinColumn(name="INGRIDIENT_ID")
    )
    private List<Ingridient> ingridientList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Integer getCategoryReceptId() {
        return categoryReceptId;
    }

    public void setCategoryReceptId(Integer categoryReceptId) {
        this.categoryReceptId=categoryReceptId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public CategoryRecept getCategoryRecept() {
        return categoryRecept;
    }

    public void setCategoryRecept(CategoryRecept categoryRecept) {
        this.categoryRecept=categoryRecept;
    }

    public List <Ingridient> getIngridientList() {
        return ingridientList;
    }

    public void setIngridientList(List <Ingridient> ingridientList) {
        this.ingridientList=ingridientList;
    }


    public Recept() {
    }
}
