package com.example.demo4.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude = "password") // 自動生成されるtostringにpasswordを出力しない
public class Users {
	@Id
	public String userName;
	public String password;
	public String name;
	public String roleName;
}