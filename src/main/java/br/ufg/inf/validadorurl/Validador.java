package br.ufg.inf.validadorurl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {

	public static boolean validarUrl(String url) {
		final String regex = "\\b(https?|ftp|file):\\/\\/([-a-zA-Z0-9]*)\\.([-a-zA-Z0-9.]*)\\/?([-a-zA-Z0-9.]*)\\/([-a-zA-Z0-9.]*\\=[-a-zA-Z0-9.]*)";
		//final String string = "http://www.google.com/teste/user=asdf";

		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(url);
		
		if(matcher.matches()){
				System.out.println("protocolo: " + matcher.group(1));
				System.out.println("host: " + matcher.group(2));
				System.out.println("dominio: " + matcher.group(3));
				System.out.println("path: " + matcher.group(4));
				System.out.println("parâmetros: " + matcher.group(5));
				
				return true;
		}
		else{
			System.out.println("A url não é válida!");
			return false;
		}
	}
}
