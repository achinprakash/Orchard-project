package com.mindtree.ferrari.exceptions;

import java.sql.SQLException;

public class DAOException extends Exception {

	public DAOException(String string, SQLException sqlException) {
		System.out.println(string);
	}

}
