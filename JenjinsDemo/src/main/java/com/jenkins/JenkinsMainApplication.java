package com.jenkins;

import java.util.ArrayList;
import java.util.List;
public class JenkinsMainApplication {
   public static void main(String[] args) {
      String sampleString = "Cat,Dog,Elephant";
      String[] items = sampleString.split(",");
      List<String> itemList = new ArrayList<String>();
      for (String item : items) {
         itemList.add(item);
      }
      System.out.println(itemList);
      System.out.println(itemList.size());
   }
}