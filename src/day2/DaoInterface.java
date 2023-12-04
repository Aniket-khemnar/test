package day2;

import java.util.Collection;

public interface DaoInterface <T , K>{
    Collection<T> getAll();
	T getOne(K key);//Method to retrieve single record based upon its identity (ID)
	void create(T t);//Method to create a new record
	void update(Restaurant modifiedRestaurant);
	void deleteOne(Integer id);

}
