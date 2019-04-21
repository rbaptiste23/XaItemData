package com.cwd.xadata.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

//@Data
@Embeddable
public class ItemRevisionIdentity implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	

	@Column(name="site")
	private String site;
	
	@Column(name="item")
	private String item;

	@Column(name="revision")
	private String revision;
	
	public ItemRevisionIdentity() {
		
	}

	public ItemRevisionIdentity(String site, String item, String revision) {
		this.site = site;
		this.item = item;
		this.revision = revision;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((revision == null) ? 0 : revision.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemRevisionIdentity other = (ItemRevisionIdentity) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (revision == null) {
			if (other.revision != null)
				return false;
		} else if (!revision.equals(other.revision))
			return false;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemRevisionIdentity [site=" + site + ", item=" + item + ", revision=" + revision + "]";
	}
	
	
	
}
