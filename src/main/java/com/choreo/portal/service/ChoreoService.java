package com.choreo.portal.service;

import com.choreo.portal.model.Choreo;
import com.choreo.portal.repository.ChoreoRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ChoreoService {

    private final ChoreoRepo choreoRepo;

    public ChoreoService(ChoreoRepo choreoRepo) {
        this.choreoRepo = choreoRepo;
    }

    public List<Choreo> getAll() {
        return choreoRepo.findAll();
    }
}
