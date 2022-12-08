package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> list = new HashMap<>();
        Principal primarySchool = new Principal("Amadeusz", "Górny", "Primary School");
        Principal highSchool = new Principal("Alojzy", "Świderek", "High School");
        Principal secondarySchool = new Principal("Izabela", "Las", "Secondary School");

        School primarySchoolPupils = new School(Arrays.asList(40, 29, 30, 37));
        School highSchoolPupils = new School(Arrays.asList(23, 29, 45, 19));
        School secondarySchoolpupils = new School(Arrays.asList(33, 41, 20, 15, 25));

        list.put(primarySchool, primarySchoolPupils);
        list.put(highSchool, highSchoolPupils);
        list.put(secondarySchool, secondarySchoolpupils);

        for (Map.Entry<Principal, School> schoolInformations : list.entrySet()) {
            System.out.println("Principal: " + schoolInformations.getKey().getPrincipalName() + " " + schoolInformations.getKey().getPrincipalSurname() + ", " + "School: " + schoolInformations.getKey().getNameOfSchool() + ", " + "Students: " + schoolInformations.getValue().allStudentsInSchool());
        }
    }
}
