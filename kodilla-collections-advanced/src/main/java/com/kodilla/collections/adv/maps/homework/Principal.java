package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String principalName;
    private String principalSurname;
    private String nameOfSchool;

    public Principal(String principalName, String principalSurname, String nameOfSchool) {
        this.principalName = principalName;
        this.principalSurname = principalSurname;
        this.nameOfSchool = nameOfSchool;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public String getPrincipalSurname() {
        return principalSurname;
    }
    public String getNameOfSchool() {
        return nameOfSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalName, principal.principalName) && Objects.equals(principalSurname, principal.principalSurname) && Objects.equals(nameOfSchool, principal.nameOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalName, principalSurname, nameOfSchool);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalName='" + principalName + '\'' +
                ", principalSurname='" + principalSurname + '\'' +
                ", nameOfSchool='" + nameOfSchool + '\'' +
                '}';
    }
}


