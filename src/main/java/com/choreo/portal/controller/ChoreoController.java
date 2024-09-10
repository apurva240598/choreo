package com.choreo.portal.controller;

import com.choreo.portal.model.Choreo;
import com.choreo.portal.service.ChoreoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/choreos")
public class ChoreoController {

    private final ChoreoService choreoService;

    public ChoreoController(ChoreoService choreoService) {
        this.choreoService = choreoService;
    }

    @GetMapping("/all")
    public List<Choreo> getAll() {
        return choreoService.getAll();
    }

}
