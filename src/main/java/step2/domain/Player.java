package step2.domain;

import java.util.regex.Pattern;

public class Player {

    private static final String ONLY_ENGLISH_NAME_REGEX = "^[a-zA-Z]*$";
    private static final int MAX_PLAYER_NAME_LENGTH = 3;
    private static final int MIN_PLAYER_NAME_LENGTH = 1;

    private final String name;

    public Player(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (!Pattern.matches(ONLY_ENGLISH_NAME_REGEX, name)) {
            throw new IllegalArgumentException("영문 이름만 입력 가능합니다.");
        }

        if (name.length() > MAX_PLAYER_NAME_LENGTH || name.length() < MIN_PLAYER_NAME_LENGTH) {
            throw new IllegalArgumentException("한 글자 이상, 세 글자 이하로 입력 가능합니다.");
        }
    }
}
