package com.div.services;


import com.div.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User>  findByFin(String finCode);//fin coda gore axtaris parametr olaraq fin kod qebul edir ve tapilan useru geri qaytarir
    List<User> getAllUsers();//bu method butun userleri geri qaytarir

    Optional<User> findById(Long id);//idye gore axtaris. id parametri qebul edir ve geriye tapilan useri qaytarir

    //****

    User save(User user);//yeni useri elave etme.parametr olaraq elave edilmeli olan useri qebul edir
    boolean delete(User user); //silmek istenilen useri parametr olaraq qebul edir ve silir








}
