package com.musicplayerapi.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Song {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
	    private String song_name;
	    private String artist_name;
	    private String song_url;
	    private Integer rating;
	    @ManyToOne(cascade = CascadeType.ALL)
	    private Category category;
	    private String album_name;
}
