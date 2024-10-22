
package ru.mzpo.forms;

public class TrialLesson {
    public String name = "Юлия_super_test";
    public String surname = "Maximova";
    public String email = "julia_max@mail.ru";
    public String tel = "7894652312";

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getTel() {
        return tel;
    }
    public String getSurname() {
        return surname;
    }

        public TrialLesson() {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.surname = surname;
    }
}

// public void setName(String name) {
//   this.name = name;
// }
//  public void setNumber(int number) {
// this.number = number;
// }
