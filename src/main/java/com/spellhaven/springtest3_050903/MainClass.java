package com.spellhaven.springtest3_050903;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainClass {

	public static void main(String[] args) {
		// 어. 코드 도저히 안 외워져서 Springtest2에서 붙여 넣었어, ㅋ.
		
		String configPath = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configPath);
		
		// applicationCTX의 studentInfo엔 원래 student1이 들어 있었다. 그 student1 ㄱㄱ!!
		StudentInfo stinfo = ctx.getBean("studentInfo", StudentInfo.class);
		stinfo.getStudentInfo();
		
		// student1 들어 있었던 자리에 student2 넣어서(세터를 이용해서 바꿔치기 해 봤습니다, ㅋ.) 출력해 보자 ㄱㄱ!!
		Student stu2 = ctx.getBean("student2", Student.class);
		stinfo.setStudent(stu2);
		stinfo.getStudentInfo();
		
		ctx.close();
		
		// 뭐 여튼, StudentInfo는 Student 객체에 의존하고 있는데
		// 그 Student 객체를 StudentInfo에 생성자로 넣어 줄지, 세터로 넣어 줄지 두 방법이 있다~~~ 하하하~~~
		// 이 교훈을 얻으시면 됩니다. (원노트 22.05.09 월 페이지 5강 pdf 참조하셈, ㅋ)
	}

}
