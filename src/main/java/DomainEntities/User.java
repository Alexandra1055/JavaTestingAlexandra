package DomainEntities;

import javaTesting.Resources.PasswordUtils;

public class User {
    private String name;
    private String password; //passwors in hash mode and salted (podria cambiar el nombre por password_sha256)
    private String salt; //van cambiando en cada usuario
    //password == Hash (password real + salt)

    public User(){
        this("Alexandra", "secret");
    }

    public User(String name, String password){
        this.name= name;
        //this.password= password; //insegura!
        this.salt = PasswordUtils.genSalt();
        //falta hacer hash con salt de password
        this.password = PasswordUtils.hashedPassword(password,this.salt);
    }

    public String  getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean verifyPassword(String passwordEntered) {
        return PasswordUtils.verifyUserPassword(passwordEntered,salt,password);
    }

    public void setPassword(String password) {
        this.password = PasswordUtils.hashedPassword(password,salt);
    }
}
