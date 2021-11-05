package practice3.model.vo;

import practice3.controller.Animal;
import practice3.controller.Cat;
import practice3.controller.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] a = new Animal[5];   // 고양이, 강아지를 넣어줄 5칸의 객체배열 생성 
		int[] intNum = {0,1,2,3,4};   // 겹치지 않는 5개의 숫자를 만들어줄 int 배열생성
		
		for(int j = 0; j < a.length; j++) { // for문을 이용해 5개의 숫자를 섞어준다.  
			int rNum = (int)(Math.random()*a.length); //렌덤값 rNum을 만든후

			int tmp = intNum[0];  // tmp에 0번째 인덱스 값을 넣고
			intNum[0] = intNum[rNum]; //0번째 인덱스에 렌덤값의 인덱스을 넣고 
			intNum[rNum] = tmp;   //  렌덤값의 인덱스에 tmp를 넣어 반복하겨 섞어준다
		}
		
		for(int i = 0; i< a.length; i++) {  // Animal 객체배열을 초기화 하기위한 for문
			int rNum2 = (int)(Math.random()*2)+1; // 1이나오면 고양이로 , 2가나오면 강아지로 보낸다
			if(rNum2 == 1) { 
				switch(intNum[i]) {  // 고양이로 들어온 다음 위에서 만든 렌덤 번호로 초기화를 하나씩 해준다
				case 0 : a[0] = new Cat("나비","스핑크스고양이","명심산","살색"); break;
				case 1 : a[1] = new Cat("복자","샴고양이","구로동","쥐색"); break;
				case 2 : a[2] = new Cat("아리","러시안블루","자이아파트 주차장","노랑색"); break;
				case 3 : a[3] = new Cat("쫀덕이","먼치킨","쫀덕빵집","하양색"); break;
				case 4 : a[4] = new Cat("삼색이","싱가푸라","황학산","고등어색"); break;
				}
			}else if(rNum2 == 2){ 
				switch(intNum[i]) {
				case 0 : a[0] = new Dog("밍키","불독",23); break;
				case 1 : a[1] = new Dog("코코","푸들",5); break;
				case 2 : a[2] = new Dog("쿠키","프렌치 불독",11); break;
				case 3 : a[3] = new Dog("뽀삐","웰시코기",8); break;
				case 4 : a[4] = new Dog("멍멍","시츄",23); break;
				}
			}// 다섯 칸 모두 초기화 끝
		}
		for(int i =0; i < a.length;i++) { // 출력
			a[i].speak();
		}
	}
}



