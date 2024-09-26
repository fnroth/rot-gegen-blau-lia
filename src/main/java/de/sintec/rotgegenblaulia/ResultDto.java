package de.sintec.rotgegenblaulia;

public class ResultDto {
    private final String field;
    private final String state;

    public ResultDto(String field, String state) {
        this.field = field;
        this.state = state;
    }

    public String getField() {
        return field;
    }

    public String getState() {
        return state;
    }
}
