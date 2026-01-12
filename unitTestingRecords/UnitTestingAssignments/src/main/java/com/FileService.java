package com;

public class FileService {
	public boolean isCsvFile(String fileName) {
        if (fileName.endsWith(".csv")) {
            return true;
        }
        return false;
    }
}