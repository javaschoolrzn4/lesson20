package ru.springtimes.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WelcomeController extends AbstractController {
    // сообщение, которое мы хотим передать в наше представление
    public static final String HELLO_WORLD = "Привет Мир!";

    // получаем все данные о запросе
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // ищем представление по имени welcome, что будет если переименовать?
        ModelAndView model = new ModelAndView("welcome");
        // поменяем сообщение
        model.addObject("message", HELLO_WORLD);
        return model;
    }
}