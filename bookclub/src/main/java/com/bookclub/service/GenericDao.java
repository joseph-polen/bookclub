 /* Krasso, R., (2021). CIS 530 Server Side Development. Bellevue University, all
rights reserved. 
 */

package com.bookclub.service;

import java.util.List;

public interface GenericDao<E, K> {
	List<E> list();
	E find(K key);

}
