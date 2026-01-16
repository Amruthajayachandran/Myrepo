package stringprogram;

public class BufferBuilder {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Hello ");
		StringBuilder sbl = new StringBuilder("WORLD");
		System.out.println(sb);
		System.out.println(sbl);
		//insert()- to insert a new word /char based on index
		sb.insert(6, "world");
		System.out.println(sb);//sb changed from hello - to hello world
        //append() - to add new string at the end of an another string
		System.out.println(sbl.append(" Map"));
		//replace()- replace a char with an another char (index1,index2)--> start ,end
		System.out.println(sb.replace(6,11,"guys"));
		//delete() -to delete char
		System.out.println(sb.delete(5,10));
		//reverse() - to reverse the string
		System.out.println(sb.reverse());
	}

}
