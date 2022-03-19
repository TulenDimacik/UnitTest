package com.example.jvtest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void Registration() {
        String Login = "qwerty";
        String Password = "123";
        String FIO = "Гордюшин Дмитрий Александрович";
        String Email = "gord@mail.ru";
        //Assert.assertFalse("f",Utilities.checkLogin(Login));
        Assert.assertThat(String.format("Неправильный логин %s",Login), Utilities.checkLogin(Login), is(true));
        Assert.assertThat(String.format("Неправильный пароль %s",Password), Utilities.checkPassword(Password), is(true));
        Assert.assertThat(String.format("Неправильное ФИО %s",FIO), Utilities.checkFIO(FIO), is(true));
        Assert.assertThat(String.format("Неправильный Email %s",Email), Utilities.checkEmail(Email), is(true));
    }
}