package main;

import java.io.IOException;

import domain.Box;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import transform.ClassTransform;

public class Application {

	public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException {
	
		ClassTransform.transform();
		
		Box box = new Box();
		
		
		System.err.println(box.toString());

	}

}
