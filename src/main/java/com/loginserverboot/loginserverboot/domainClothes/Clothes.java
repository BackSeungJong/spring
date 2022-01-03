package com.loginserverboot.loginserverboot.domainClothes;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "clothes")
@Entity
public class Clothes {
    @Id
    private int code;

    @NotNull
    @Column
    private String size;
    private String name;
    private String img;
    private int price;
    private int cnt;
    private String category;

    public Clothes(ClothesRequestDto dto){
        this.code = dto.getCode();
        this.size = dto.getSize();
        this.name = dto.getName();
        this.img = dto.getImg();
        this.price = dto.getPrice();
        this.cnt = dto.getCnt();
        this.category = dto.getCategory();
    }

    public void update(ClothesRequestDto dto){
        this.code = dto.getCode();
        this.size = dto.getSize();
        this.name = dto.getName();
        this.img = dto.getImg();
        this.price = dto.getPrice();
        this.cnt = dto.getCnt();
        this.category = dto.getCategory();
    }
}
