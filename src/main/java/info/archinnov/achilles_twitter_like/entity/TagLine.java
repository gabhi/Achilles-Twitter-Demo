package info.archinnov.achilles_twitter_like.entity;

import info.archinnov.achilles.annotations.ColumnFamily;
import info.archinnov.achilles.entity.type.WideMap;
import info.archinnov.achilles_twitter_like.model.Tweet;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tag
 * 
 * @author DuyHai DOAN
 * 
 */
@Entity
@Table(name = "tagline")
@ColumnFamily
public class TagLine implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	private String tag;

	@Column
	private WideMap<UUID, Tweet> tagline;

	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

	public WideMap<UUID, Tweet> getTagline()
	{
		return tagline;
	}

	public void setTagline(WideMap<UUID, Tweet> tagline)
	{
		this.tagline = tagline;
	}
}
