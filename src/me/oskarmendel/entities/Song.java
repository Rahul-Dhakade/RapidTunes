/**
 * RapidTunes.
 * The music application to help you use all your music sources in one place.
 *
 * The MIT License (MIT)
 *
 * Copyright (C) 2016 The RapidTunes
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.oskarmendel.entities;

/**
 * Object representing a song
 * 
 * @author Jesper Bergstr�m
 * @version 0.00.00
 * @name Song.java
 */
public class Song {
	
	private String title;
	private String artist;
	private String album;
	private int length;
	
	public Song(){
		
	}
	
	/**
	 * Get song title
	 * 
	 * @return title
	 */
	public String getTitle(){
		return title;
	}
	
	/**
	 * Set song title
	 * 
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 * Get artist
	 * 
	 * @return artist
	 */
	public String getArtist(){
		return artist;
	}
	
	/**
	 * Set artist
	 * 
	 * @param artist
	 */
	public void setArtist(String artist){
		this.artist = artist;
	}
	
	/**
	 * Get album
	 * 
	 * @return album
	 */
	public String getAlbum(){
		return album;
	}
	
	/**
	 * Set album
	 * 
	 * @param album
	 */
	public void setAlbum(String album){
		this.album = album;
	}
	
	/**
	 * Get song length
	 * 
	 * @return length
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * Set song length
	 * 
	 * @param length
	 */
	public void setLength(int length){
		this.length = length;
	}
}
