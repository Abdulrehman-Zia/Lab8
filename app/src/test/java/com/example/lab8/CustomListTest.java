package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void getCountTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),1);
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City test = new City("Estevan", "SK");
        list.addCity(test);
        assertTrue(list.hasCity(test));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City test = new City("Estevan", "SK");
        list.addCity(test);
        list.deleteCity(test);
        assertEquals(list.getCount(),0);
    }

}
