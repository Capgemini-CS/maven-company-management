package com.company.repository;

import com.company.exceptions.AccessDatabaseException;
import com.company.exceptions.DeleteValueException;
import com.company.exceptions.InsertValueException;

import java.util.List;

public interface RepositoryInterface<T> {


   List<T> getAll() throws AccessDatabaseException;

   void add(T dataType) throws InsertValueException;

   void deleteById(long id) throws DeleteValueException;

}
