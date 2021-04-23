package in.reqres.certification.utils.enums;

public enum UserEnum {

    NAME_USER("Lindsay"),
    EMAIL_USER("lindsay.ferguson@reqres.in");

    private String value;

    public String getValue() {
        return value;
    }

    UserEnum(String value) {
        this.value = value;
    }
}
