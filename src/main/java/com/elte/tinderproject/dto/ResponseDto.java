package com.elte.tinderproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> {
    private int errCode;
    private String errMessage;
    private T data;


    public <T> ResponseDto<T> getErrObject(int errCode,String errMessage){
        return new ResponseDto<>(errCode,errMessage,null);
    }


}
