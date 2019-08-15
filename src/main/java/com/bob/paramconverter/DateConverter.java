package com.bob.paramconverter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    只要实现了这个Converter接口，可以将url中的String参数变为Date类型
        */

@Component
public class DateConverter implements Converter<String, Date> {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Date convert(String source) {
        if(source != null && !"".equals(source)){
            try{
                return sdf.parse(source);
            }catch (ParseException e){
                e.printStackTrace();
            }
        }

        return null;
    }
}
