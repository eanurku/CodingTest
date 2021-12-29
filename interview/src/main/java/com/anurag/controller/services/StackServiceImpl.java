package com.anurag.controller.services;

import com.anurag.models.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StackServiceImpl implements StackService{
    List<Data> list=new LinkedList<>();
  // 1 2 3 4

    @Override
    public  void push(Data data) {
        synchronized (list){
            list.add(data);
        }

    }

    @Override
    public  Data pop() throws Exception {
        Data element=null;
        synchronized (list){
        if(list.size()==0){
            throw  new Exception("stack is empty");
        }


             element = list.remove(list.size() - 1);
        }

        return element;
    }

    @Override
    public int size() {
        return list.size();
    }
}
