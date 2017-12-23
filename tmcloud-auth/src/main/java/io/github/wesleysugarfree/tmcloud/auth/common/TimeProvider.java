package io.github.wesleysugarfree.tmcloud.auth.common;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alucard on 8/13/17.
 */
@Component
public class TimeProvider implements Serializable {

    private static final long serialVersionUID = -3301695478208950415L;

    public Date now() {
        return new Date();
    }

    public Date parseStringDate(String str){
        try{
            DateFormat date = new SimpleDateFormat("EEE MMM dd kk:mm:ss zzz yyyy");
            return date.parse(str);
        }catch (ParseException e){
            System.out.println(e.getCause().toString());
        }

        return now();
    }
}