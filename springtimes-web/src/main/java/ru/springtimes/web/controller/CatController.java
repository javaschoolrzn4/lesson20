package ru.springtimes.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.springtimes.data.MrCat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CatController {
    private static List<MrCat> catList = new ArrayList<MrCat>();

    static {
        catList.add(new MrCat("Барсик", "Белый"));
        catList.add(new MrCat("Снежок", "Белый"));
        catList.add(new MrCat("Пират", "Черный"));
        catList.add(new MrCat("Дымок", "Серый"));
        catList.add(new MrCat("Пиксель", "Рыжый"));
    }

    @RequestMapping(value = "/cat", method = RequestMethod.GET)
    public String index(Map<String, Object> sayModel, @ModelAttribute("model") ModelMap catModel) {
        sayModel.put("say", "Мяу!");
        catModel.addAttribute("catList", catList);
        return "cat";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("cat") MrCat mrCat) {
        // Тут может быть любая логика, но в хороших приложения тут идет вызов сервисного слоя
        if (null != mrCat && null != mrCat.getFirstName() && null != mrCat.getColor() && !mrCat.getFirstName().isEmpty() && !mrCat.getColor().isEmpty()) {
            synchronized (catList) {
                catList.add(mrCat);
            }
        }
        return "redirect:cat";
    }
}