package org.example;

public class MemberDto {

    private String name;
    private String email;
    private String pwd;

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public MemberDto(String name, String email, String pwd) {
        this.name = name;
        this.email = email;
        this.pwd = pwd;
    }
}
//DTO는 새로운 항목을 추가할 떄마다 계속 만들어 지는 거라서 AnnotationConfigApplicationContext 안에
//만들어지는 객체가 아님.
