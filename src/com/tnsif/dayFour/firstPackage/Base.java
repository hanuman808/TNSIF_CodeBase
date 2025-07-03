package com.tnsif.dayFour.firstPackage;

public class Base {
int varDefault = 10;
public int varPublic=20;
private int varPrivate=30;
protected int varProtected=40;



void methodDefault() {
	System.out.println(varDefault);
}
void methodPublic() {
	System.out.println(varPublic);

}

void methodProtected() {
	System.out.println(varProtected);

}
void methodPrivate() {
	System.out.println(varPrivate);

}
}
