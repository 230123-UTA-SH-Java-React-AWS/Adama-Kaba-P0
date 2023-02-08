package com.revature.model;

public class NewUser {
    private String username;
    private String login;
    private String password;
    /* new user has ability to add in a reimbursement request
    depending on the message + then a ticket number will be attached to the request
     */
    private String request;


    public String getUsername() {
        return username;
    }
    // can use either email or username id

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest() {
        this.request = request;
    }
}

