package com.sbs.obj.test.main;

import com.sbs.obj.test.Acls;
import com.sbs.obj.test.Bcls;
import com.sbs.obj.test.Ccls;

public class Test extends Ccls {
	public static void main(String[] args) {
		Acls a = new Acls();		
		Bcls b = new Bcls();
		Ccls c = new Ccls();
		Dcls d = new Dcls();
				
		abcd(d);
	}
	
	public static void abcd(Acls cls) {
		cls.show();
	}

	public static void show(Acls cls) {
		cls.show();
	}
	
	
}
