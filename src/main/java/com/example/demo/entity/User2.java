package com.example.demo.entity;
import java.util.Date;

import lombok.Data;

@Data
public class User2 {
  
   private Long id;
   /**
    * 店名
    */
   private String name;
   /**
    * ジャンル
    */
   private String addoress;
   /**
    * 電話番号
    */
   private String phone;
   
   
   private String pname;
   /**
    * 更新日時
    */
   private Date updateDate;
   /**
    * 登録日時
    */
   private int num;
   /**
    * 削除日時
    */
   private Date deleteDate;
}