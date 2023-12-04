package com.example.song.controller;

import com.example.song.model.Song;
import com.example.song.service.SongJpaService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@RestController
public class SongController {
    @Autowired
    public SongJpaService songJpaService;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songJpaService.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songJpaService.addSong(song);
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return songJpaService.getSongById(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song upadateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songJpaService.upadateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSongById(@PathVariable("songId") int songId) {
        songJpaService.deleteSongById(songId);
    }
}