
package com.mycompany.task.oop.jdbc;

public interface ICrudRepository<T> {
     
    
void loadData();
    
   
    void insertRecord(T product);
    
    void updateRecord(int id, T product);
    
    void deleteRecord(int productId);
  
}
