package main;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import domain.Box;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import transform.ClassTransform;

public class Application {

	public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
			
		Box box_1 = (Box) ClassTransform.transform().getConstructor(int.class, String.class).newInstance(100, "Moldova");
		Box box_2 = new Box();
		
		System.err.println(box_1.toString());
		System.err.println(box_2.toString());

	}

}
