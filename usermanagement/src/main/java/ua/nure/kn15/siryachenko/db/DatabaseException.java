package ua.nure.kn15.siryachenko.db;

public class DatabaseException extends Exception {
	public DatabaseException(Throwable e) {
		super(e);
	}

	public DatabaseException(String string) {
		super(string);
	}

	public DatabaseException() {
		super();
	}
}
