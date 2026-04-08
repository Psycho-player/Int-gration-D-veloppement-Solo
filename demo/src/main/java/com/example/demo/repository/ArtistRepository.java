package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

    List<Artist> findByLastname(String lastname);
}
