 /* Krasso, R., (2021). CIS 530 Server Side Development. Bellevue University, all
rights reserved. 
 */


package com.bookclub.service;

import java.util.List;

public interface GenericCrudDao<E, K> {
    void add(E entity);
    void update(E entity);
    boolean remove(K key);
    List<E> list(K key);
    E find(K key);
}
