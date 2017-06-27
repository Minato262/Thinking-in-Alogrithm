package org.kay.com.test.asyn;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kay
 * @version v0.0.1
 */
public class AsynTest {

    @Test
    public void test() {
        Map map = new HashMap<>();
        map.put("1", "String");
        map.put("2", 1);
        map.put("3", 1L);

        Result<Map> json = new Result<>(1, map);
        Result<Map> result = (Result) json;
        Map id = result.getData();
        System.out.println(result.getInt());
        System.out.println(id.get("1"));
        System.out.println(map);
    }
}
