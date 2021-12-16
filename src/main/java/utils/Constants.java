package utils;

import java.util.regex.Pattern;

public class Constants {
	// 단위 상수
	public static final String CONSTANT = "상수";

	// 정규식
	// 사이트: https://regexr.com/5mhou
	public static final String SEPARATOR = ", ";

	public static final String NAMES_REGEX = "^[^, ]*, [^, ]*$";
	public static final String NAME_REGEX = "^[가-힣a-zA-Z]{1,5}$";
	public static final String MONEY_REGEX = "^[1-9][0-9]*$";
	public static final String ASK_REGEX = "^[x]|[y]$";

	public static final Pattern NAMES_PATTERN = Pattern.compile(NAMES_REGEX);
	public static final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);
	public static final Pattern MONEY_PATTERN = Pattern.compile(MONEY_REGEX);
	public static final Pattern ASK_PATTERN = Pattern.compile(ASK_REGEX);

	// 오류메세지 관련 상수
	public static final String ERROR = "[ERROR] ";
	public static final String ERROR_MONEY_PATTERN = ERROR + "숫자 입력은 비지 않은 1 이상의 정수 형식이어야 한다.";
	public static final String ERROR_NAME_PATTERN = ERROR + "이름 입력은 1~5개의 문자 형식이어야 한다.";
	public static final String ERROR_NAMES_PATTERN = ERROR + "이름 사이에 ', '로 나눠야 한다.";
	public static final String ERROR_NAMES_DUPLICATED_PATTERN = ERROR + "중복된 이름이 있으면 안된다.";
	public static final String ERROR_ASK_PATTERN = ERROR + "입력은 x나 y여야 한다.";
}
