package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;

@Data
//@NoArgsConstructor //기본 생성자 포함
//@AllArgsConstructor //모든 필드 초기화시키는 생성자 포함
public class Member {
	private final String id;
	@NonNull private String name; //초기화된 final 필드는 변경할 수 없지만, @NonNull은 null이 아닌 다른 값으로 Setter를 통해 변경 가능
	private int age;
}
