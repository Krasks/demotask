package com.amberlabs.demotask.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "DEMOTASK_PERSON")
@Entity(name = "demotask_Person")
@NamePattern("%s|lastName")
public class Person extends StandardEntity {
    private static final long serialVersionUID = 8653584313150048769L;

    @NotNull
    @Lob
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @NotNull
    @Lob
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Lob
    @Column(name = "PATRONYMIC_NAME")
    private String patronymicName;
    @Column(name = "EMAIL", nullable = false, length = 1000)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}