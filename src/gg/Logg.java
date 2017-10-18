package gg;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import collectionlambda.Myclass;

public class Logg {
	public static void main(String[] args) {
		LogManager lm = LogManager.getLogManager();
		Logger logger = Logger.getLogger(Myclass.class.getName());
		logger.log(Level.INFO, "My first log message");
		logger.log(Level.INFO, "Another message");
		
	}
}
