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
		
//		pool.appendClassPath("D:\\vbalan_Java_3\\javassistTransform\\bin");
//		pool.appendClassPath("bin");
		
		CtClass cc = pool.get("domain.Box");
		
		cc.defrost();
		
		CtConstructor ccons = cc.getDeclaredConstructor(null);
		cc.removeConstructor(ccons);
		
		CtConstructor cstructor = CtNewConstructor.defaultConstructor(cc);
		
		cstructor.setBody("this.id = 50;");
		
		cc.addConstructor(cstructor);
		
		return cc.toClass();
		
	}

}
