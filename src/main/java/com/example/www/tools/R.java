package com.example.www.tools;

import lombok.Data;

/**
 * @author MuShan
 */
@Data
public class R<T>{
    private Integer code;
    private String msg;
    private T data;

    public static <T> R<T> success(T object,String msg,Integer code){
        R<T> r=new R<T>();
        r.data=object;
        r.code=code;
        r.msg=msg;
        return r;
    }

    public static <T> R<T> success(T object){
        R<T> r=new R<T>();
        r.data=object;
        r.code=200;
        r.msg="成功";
        return r;
    }

    public static <T> R<T> error(String msg,Integer code){
        R<T> r=new R<T>();
        r.msg=msg;
        r.code=code;
        return r;
    }

    public static <T> R<T> error(){
        R<T> r=new R<T>();
        r.msg="失败";
        r.code=400;
        return r;
    }
}