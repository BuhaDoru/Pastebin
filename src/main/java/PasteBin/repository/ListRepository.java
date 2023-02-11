package PasteBin.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import PasteBin.model.Note;
import org.springframework.stereotype.Repository;


@Repository
public interface ListRepository extends JpaRepository<Note, Integer> {

}