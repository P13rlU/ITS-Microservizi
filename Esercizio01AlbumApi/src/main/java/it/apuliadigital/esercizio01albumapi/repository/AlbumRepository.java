package it.apuliadigital.esercizio01albumapi.repository;

import it.apuliadigital.esercizio01albumapi.entity.AlbumEntity;
import it.apuliadigital.esercizio01albumapi.model.Album;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<AlbumEntity, Long> {

    List<AlbumEntity> findByGenre(Album.GenereEnum genre);
}
