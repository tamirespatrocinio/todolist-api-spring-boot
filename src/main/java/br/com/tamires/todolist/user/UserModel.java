package br.com.tamires.todolist.user;

public class UserModel {
  private String username;
  private String name;
  private String password;

  // inserir o valor
  public void setUsername(String username) {
    this.username = username;
  }

  // buscar o valor
  public String getUsername() {
    return username;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }
}
