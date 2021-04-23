package in.reqres.certification.models;

public class UserModel {

    private String _name;
    private String _job;


    public UserModel(String name, String job) {
        _name = name;
        _job = job;
    }

    public UserModel() {
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_job() {
        return _job;
    }

    public void set_job(String _job) {
        this._job = _job;
    }
}
