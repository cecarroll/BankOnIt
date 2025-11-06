abstract class User implements HasMenu{
    private String userName;
    private String PIN;
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getPIN(){
        return PIN;
    }
    public void setPIN(String PIN){
        this.PIN = PIN;
    }
}