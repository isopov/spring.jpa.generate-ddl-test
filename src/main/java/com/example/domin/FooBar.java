package com.example.domin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foobar")
public class FooBar {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
	private long id;
	
	@Column
	private String foo;

	public long getId() {
		return id;
	}

	public String getFoo() {
		return foo;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
}
