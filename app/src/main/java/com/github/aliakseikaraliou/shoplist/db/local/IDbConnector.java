package com.github.aliakseikaraliou.shoplist.db.local;

import java.util.List;

public interface IDbConnector<T> {

    long put(T item);

    List<T> getAll();

    int remove(T item);
}