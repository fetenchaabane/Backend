package com.faten.parfums.service;

import java.util.List;

import com.faten.parfums.entities.Parfum;
import com.faten.parfums.entities.Type;

public interface ParfumService {
    Parfum saveParfum(Parfum p);
    Parfum updateParfum(Parfum p);
    void deleteParfum(Parfum p);
    void deleteParfumById(Long id);
    Parfum getParfum(Long id);
    List<Parfum> getAllParfums();
    
    List<Parfum> findByNomParfum(String nom);
    List<Parfum> findByNomParfumContains(String nom);
    List<Parfum> findByNomPrix(String nom, Double prix);
    List<Parfum> findByType(Type type);
    List<Parfum> findByTypeIdTyp(Long id);
    List<Parfum> findByOrderByNomParfumAsc();
    List<Parfum> trierParfumsNomsPrix();
}

