package com.Algorial.datatables;

import lombok.Data;

@Data
public class AddUser {
	private String firstname;
	private String lastname;
	private String email;
	private String postcode;
	private String password;
	private String confirmPassword;
	private String time;
	private String date;
	private String nooftable;
	private String description;
	private String phoneno;
}
