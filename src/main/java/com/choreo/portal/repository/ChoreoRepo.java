package com.choreo.portal.repository;

import com.choreo.portal.model.Choreo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoreoRepo extends JpaRepository<Choreo, String> {
}
