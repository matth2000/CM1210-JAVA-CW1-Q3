public class instruments{
	private String name;
	private String playMethod;
	private String material;
	private String sound;

	public String getName(){
		return name;
	} 

	public String getPlayMethod(){
		return playMethod;
	}

	public String getSize(){
		return size;
	}

	public String playSound(){
		return sound
	}

	public void instruments(String inName, String inPlayMethod, String inSize){
		name = inName;
		playMethod = inPlayMethod;
		size = inSize;
	}
}