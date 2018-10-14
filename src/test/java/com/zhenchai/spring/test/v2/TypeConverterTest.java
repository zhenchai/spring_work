package com.zhenchai.spring.test.v2;

import com.zhenchai.spring.beans.SimpleTypeConverter;
import org.junit.Assert;
import org.junit.Test;
import com.zhenchai.spring.beans.TypeConverter;
import com.zhenchai.spring.beans.TypeMismatchException;

import static org.junit.Assert.fail;

/**
 * Created by zhenchai on 2018/10/14 .
 * Description:
 */
public class TypeConverterTest {

    @Test
    public void testConvertStringToInt() {
        TypeConverter converter = new SimpleTypeConverter();
        Integer i = converter.convertIfNecessary("3", Integer.class);
        Assert.assertEquals(3,i.intValue());

        try{
            converter.convertIfNecessary("3.1", Integer.class);
        }catch(TypeMismatchException e){
            return;
        }
        fail();
    }
    @Test
    public void testConvertStringToBoolean(){
        TypeConverter converter = new SimpleTypeConverter();
        Boolean b = converter.convertIfNecessary("true", Boolean.class);
        Assert.assertEquals(true,b.booleanValue());

        try{
            converter.convertIfNecessary("xxxyyyzzz", Boolean.class);
        }catch(TypeMismatchException e){
            return;
        }
        fail();
    }
}
