package com.luv2code.springcoredemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;



    public void initialBeanMethod() {
        log.info("before bean is created");
        System.out.println("it will execute before bean is created");
    }
    public void destroyBeanMethod() {
        log.info("after bean is destroyed");
        System.out.println("it will execute after bean is destroyed");
    }





}

