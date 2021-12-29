package com.anurag.controller.services;

import com.anurag.models.Data;

public interface StackService {
    public void push(Data data);
    public Data pop() throws Exception;
    public int size();
}
