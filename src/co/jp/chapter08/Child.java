package co.jp.chapter08;

public class Child extends Parent{
	@Override // ÓH¥¯¥é¥¹¤ÎŠÖÆµÄ¤ËOverride¤¹¤ëÒâÎ¶£¨¥¢¥Î¥Æ©`¥·¥ç¥ó£©
	public void hello() {
		System.out.println("child method");
	}

}
