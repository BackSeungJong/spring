package com.loginserverboot.loginserverboot.domainClothes;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ClothesRequestDto {
    private int code;
    private String size;
    private String name;
    private String img;
    private int price;
    private int cnt;
    private String category;

    public ClothesRequestDto(String size, String name, String img, int price, int cnt, String category){
        this.size = size;
        this.name = name;
        this.img = img;
        this.price = price;
        this.cnt = cnt;
        this.category = category;
    }

    public ClothesRequestDto(int code, String size, String name, String img, int price, int cnt, String category){
        this.code = code;
        this.size = size;
        this.name = name;
        this.img = img;
        this.price = price;
        this.cnt = cnt;
        this.category = category;
    }
}
