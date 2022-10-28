package com.examen.service;

import com.examen.entity.Sala;
import com.examen.repository.SalaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service/*el @implementa*/
public class SalaService implements ISalaService {
    
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listRoom() {
        return (List<Sala>)salaRepository.findAll();}   
}