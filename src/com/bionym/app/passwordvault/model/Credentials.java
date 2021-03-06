package com.bionym.app.passwordvault.model;

import java.io.Serializable;

/**
 * 
 * Credentials is a model class for getting/setting user input credential
 * details.
 * <ul>
 * Credential Object contains:
 * <li>Tag/Label name of the credential</li>
 * <li>Password</li>
 * <li>isFavourite flag</li>
 * </ul>
 * 
 * @author sonal.agarwal
 * 
 * @Copyright (c) 2014 Nymi Inc. All rights reserved.
 */

public class Credentials implements Serializable {

	/**
	 * Autogenerated SerialVersionUID
	 */
	private static final long serialVersionUID = 1817932665403973750L;
	private String pwd;
	private String tag;
	private String website;
	private boolean isFavorite;

	/**
	 * Returns true if entry is marked as Favorite else return false
	 * 
	 * @return if the credential is marked as favorite then return true else
	 *         false
	 */

	public boolean isFavourite() {
		return isFavorite;
	}

	/**
	 * Sets true if credential is marked as Favorite/starred else false
	 * 
	 * @param fav
	 *            true if credential is marked as Favorite/starred else false
	 */
	public void setFavourite(boolean fav) {
		this.isFavorite = fav;
	}

	/**
	 * Returns the tag/label of the credential
	 * 
	 * @return the tag/label of the credential e.g. Gmail/Yahoo
	 */

	public String getTag() {
		return tag;
	}

	/**
	 * Sets the tag/label of the credential
	 * 
	 * @param tag
	 *            the tag/label of the credential e.g. Gmail/Yahoo
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * Returns the encrypted password which the user enters for the credential
	 * 
	 * @return the encrypted credential password
	 */
	public String getPassword() {
		return pwd;
	}

	/**
	 * sets the encrypted credential password
	 * 
	 * @param password
	 *            encrypted credential password
	 */
	public void setPassword(String password) {
		this.pwd = password;
	}

	/**
	 * Returns the website url like www.gmail.com
	 * 
	 * @return the website url
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * sets the website url like www.gmail.com
	 * 
	 * @param password
	 *            website url
	 */
	public void setWebsite(String url) {
		this.website = url;
	}

}
