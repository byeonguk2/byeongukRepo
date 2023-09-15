package menu;

import java.util.List;

import main.Main;

// 

public class UserInput {

	public void userInput(int num,List<Menu> list ) {
		List<Menu> list1 = list; 
		Menu result = (Menu)list1.get(num-1);
		System.out.println("메뉴이름: "+result.getName());
		System.out.println("메뉴가격: "+result.getPrice());
		
		
				
		
		
	}
	}

