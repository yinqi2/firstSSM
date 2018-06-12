package com.yinqi.controller.converter;

import com.sun.corba.se.impl.io.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        try {
            SimpleDateFormat sdf = getSimpleDateFormat(s);
            return sdf.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private SimpleDateFormat getSimpleDateFormat(String s) {
        SimpleDateFormat sdf = null;
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", s)){
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        }else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", s)){
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        }else{
            throw new TypeMismatchException("日期格式不对");
        }
        return sdf;
    }
}
