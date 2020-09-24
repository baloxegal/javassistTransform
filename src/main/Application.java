package main;

import java.io.IOException;

import domain.Box;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import transform.ClassTransform;

public class Application {

	public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException {
	
//		Box box = new Box();
//		System.err.println(box.toString());
		
		ClassTransform.transform();
		
		Box box_1 = new Box();
		
		
		//System.err.println(box.toString());
		System.err.println(box_1.toString());

	}

}
