package PasteBin.service;

import PasteBin.model.Note;
import PasteBin.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ListServiceImp implements ListService {

    @Autowired
    private ListRepository listRepository;

    @Override
    public Note saveList(Note note) {
        return listRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return listRepository.findAll();
    }

    @Override
    public Note deleteById(Integer id) {
        try {
        listRepository.deleteById(id);
        } catch (DataAccessException e) {
            System.out.println("Nu exista acest id!");
        }
        return null;
    }
}
