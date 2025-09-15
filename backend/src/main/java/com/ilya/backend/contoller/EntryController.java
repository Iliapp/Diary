package com.ilya.backend.contoller;



import com.ilya.backend.model.Entry;
import com.ilya.backend.service.EntryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/entries")

public class EntryController {

    private final EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }
    //Get all elements
    @GetMapping
    public List<Entry> getAllEntries() {
        return entryService.getAllEntry();
    }
    //Get by id
    @GetMapping("/{id}")
    public Optional<Entry> getEntryById(@PathVariable UUID id) {
        return entryService.getEntryById(id);
    }
    //create elements
    @PostMapping
    public Entry createEntry(@RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }
    //update elments
    @PutMapping("/{id}")
    public Entry updateEntry(@PathVariable UUID id, @RequestBody Entry updateEntry) {
        return entryService.updateEntry(id, updateEntry);
    }
    //delete elments
    @DeleteMapping("/{id}")
    public void deleteEntryById(@PathVariable UUID id) {
        entryService.deleteEntry(id);
    }




}
