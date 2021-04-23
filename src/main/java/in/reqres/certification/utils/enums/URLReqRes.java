package in.reqres.certification.utils.enums;

public enum URLReqRes {
    URI_BASE("https://reqres.in/api/"),
    URI_SUFFIX_USERS("users"),
    URI_SUFFIX_USERS_ID_SUCCESS("users/8"),
    URI_SUFFIX_USERS_ID_WRONG("users/andres");

    private String value;

    public String getValue() {
        return value;
    }

    URLReqRes(String value) {
        this.value = value;
    }
}
