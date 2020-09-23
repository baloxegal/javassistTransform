package transform;

import java.io.IOException;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtNewConstructor;
import javassist.NotFoundException;

public class ClassTransform {
	
	public static Class<?> transform () throws NotFoundException, CannotCompileException, IOException{
		
		ClassPool pool = ClassPool.getDefault();
				
		CtClass cc = pool.get("domain.Box");
		
				
		CtConstructor ccons = cc.getDeclaredConstructor(null);
		//cc.removeConstructor(ccons);
		
		ccons.setBody("this.id = 40;");
		
//		CtConstructor cstructor = CtNewConstructor.defaultConstructor(cc);
//		
//		cstructor.setBody("this.id = 50;");
//		
//		cc.addConstructor(cstructor);
		
		return cc.toClass();
		
	}

}
