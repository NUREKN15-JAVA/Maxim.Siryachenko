package ua.nure.kn15.siryachenko.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseException;
}
