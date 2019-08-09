package main.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Movies")
@EntityListeners(AuditingEntityListener.class)
public class Movies {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String category;

    @NotBlank
    private String length;


    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date addedon;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getLength() {
        return length;
    }


    public void setLength(String length) {
        this.length = length;
    }


    public Date getAddedon() {
        return addedon;
    }


    public void setAddedon(Date addedon) {
        this.addedon = addedon;
    }

@Override
    public String toString(){
    return "Movies{" + "id" +id +",name=" +name + '\'' +'}';
    }
    }
