package com.example.katzir.testproject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sean1 on 29/10/2015.
 */
public class Categories {

    public List<String> parentHeaderInformation;
    public HashMap<String, List<String>> allChildItems;
    public Categories(){
        parentHeaderInformation = new ArrayList<String>();

        parentHeaderInformation.add("Cars");

        parentHeaderInformation.add("Houses");

        parentHeaderInformation.add("Football Clubs");

        allChildItems = returnGroupedChildItems();
    }

    private HashMap<String, List<String>> returnGroupedChildItems(){

        HashMap<String, List<String>> childContent = new HashMap<String, List<String>>();

        List<String> cars = new ArrayList<String>();

        cars.add("Volvo");

        cars.add("BMW");

        cars.add("Toyota");

        cars.add("Nissan");

        List<String> houses = new ArrayList<String>();

        houses.add("Duplex");

        houses.add("Twin Duplex");

        houses.add("Bungalow");

        houses.add("Two Storey");

        List<String> footballClubs = new ArrayList<String>();

        footballClubs.add("Liverpool");

        footballClubs.add("Arsenal");

        footballClubs.add("Stoke City");

        footballClubs.add("West Ham");

        childContent.put(parentHeaderInformation.get(0), cars);

        childContent.put(parentHeaderInformation.get(1), houses);

        childContent.put(parentHeaderInformation.get(2), footballClubs);

        return childContent;

    }
}
