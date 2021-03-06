package me.maybecoffee.blog.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
}
