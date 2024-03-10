package com.mtit.osgi.helloservice;

import java.util.Set;

public class DictionaryImpl implements Dictionary {

	private final Set<String> fWords = Set.of("osgi", "eclipse", "equinox");
	private final String fLanguage = "en_US";

	public String getLanguage() {
		return fLanguage;
	}

	public boolean check(String word) {
		return fWords.contains(word);
	}

	public String toString() {
		return fLanguage;
	}

}
