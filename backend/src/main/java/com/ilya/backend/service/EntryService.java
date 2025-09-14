package com.ilya.backend.service;

import com.ilya.backend.model.Entry;
import com.ilya.backend.repository.EntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service




public class EntryService {

    //Create new object
    private final EntryRepository entryRepository;

    public EntryService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public Entry createEntry(Entry entry){
        return entryRepository.save(entry);
    }

    // return all
    public List<Entry> getAllEntry() {
        return entryRepository.findAll();
    }





}
