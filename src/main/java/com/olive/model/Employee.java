package com.olive.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="Tab_Emp")
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
@Id	
private Integer eid;
private String ename;
private double esal;
private String address;

}
