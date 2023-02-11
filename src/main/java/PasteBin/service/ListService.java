package PasteBin.service;

import PasteBin.model.Note;

import java.util.List;

public interface ListService {
    public Note saveList(Note note);
    public List<Note> getAllNotes();

    public Note deleteById(Integer id);
}
