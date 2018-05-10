package com;

import org.junit.Test;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestDataCreatorTests {

    @Test
    public void dummy() {
        // given

        // when
        Data result = TestDataCreator.dummy(Data.class);

        // then
        assertEquals(result.id, 0);
        assertNotNull(result.name);
        assertTrue(result.name.length() > 0);
    }

    @Test
    public void dummyDefault(){
        // given
        Map<String, Object> param = new HashMap();
        param.put("name", "Peter");

        // when
        Data result = TestDataCreator.dummy(Data.class, param);

        // then
        assertEquals(result.name, "Peter");
    }

}

class Data {

    @Id
    @GeneratedValue
    int id;

    String name;
}