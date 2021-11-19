package com.nttdata.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListController {
    private final Integer limitList = 50;
    private List<Integer> list = new ArrayList<>(limitList);
   // private List<Integer> nonRepeatingList = new ArrayList<>(limitList);

    public void generateList(){
        for(int x = 0; x < limitList; x++){
            list.add((int) (Math.random() * 50 + 1));
        }
    }


    public boolean compareList(List<Integer> list){
        for (int x = 0; x < this.list.size(); x++){
            for (int i = x + 1; i < this.list.size(); i++){
                if (this.list.get(x) == this.list.get(i)){
                    return true;
                }
            }
        }
        return false;
    }

    public List<Integer> onlyList(List<Integer> listRepeated1){

        Set<Integer> set = new HashSet<>(listRepeated1);
        listRepeated1.clear();
        listRepeated1.addAll(set);
        return listRepeated1;
    }

    @Override
    public String toString() {
        return "ListController{" +
                "list=" + list +
                '}';
    }

    public Integer getLimitList() {
        return limitList;
    }

    public List<Integer> getList() {
        return list;
    }
}
