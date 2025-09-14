package com.ilya.backend.repository;


import model.Entry;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.UUID;


public interface EntryRepository  extends JpaRepository<Entry,UUID> {



    List<Entry> findByUserId(UUID userId);





}

