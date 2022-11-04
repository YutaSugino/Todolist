package com. example. todolist. entity;
import java. sql. Date;
import javax. persistence. Column;
import javax. persistence. Entity;
import javax. persistence. GeneratedValue;
import javax. persistence. GenerationType;
import javax. persistence. Id;
import javax. persistence. Table;
import lombok. Data;

@Entity 
@Table(name = "todo")
@Data
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	
	@Column(name ="title")
	private String title;
	
	@Column(name ="importance")
	private Integer importance;
	
	@Column(name ="urgency")
	private Integer urgency;
	
	@Column(name ="deadline")
	private Date deadline;
	
	@Column(name ="done")
	private String done;
}
