//2，构建一个学生类
//	类有姓名（String），学号（String），年级（int），专业（String）
//	然后动态生成 10 个对象，并输出相应的变量
public class E12_CreateAClass_Main {
	public static void main(String[] args) {
		int total=10;
		E12_CreateAClass stu;
		for (int i = 0; i < total; i++) {
			 stu =new E12_CreateAClass();
			 stu.name="Student"+(i+1);
			 stu.number=""+(i+1);
			 stu.grade="Sophomore";
			 stu.major="Computer";
			 System.out.println(stu.name+"的学号是"+stu.number+""
			 		+ "，年级是"+stu.grade+"，专业是"+stu.major);
		}

	}
}
