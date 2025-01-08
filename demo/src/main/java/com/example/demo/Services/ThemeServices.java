package com.example.demo.Services;

import com.example.demo.Spring.Theme;

import java.util.ArrayList;
import java.util.List;

public class ThemeServices {


private List<Theme> themes=new ArrayList<Theme>();

//Μέθοδος για να προσθέσεις theme
public void addTheme(Theme theme) {
    themes.add(theme);
}

//Μέθοδος για να διαγράψεις theme
public void removeTheme(Theme theme) {
    themes.remove(theme);
}

//Μέθοδος για να αλλάξεις theme
public void updateTheme(Theme theme) {
    for (int i = 0; i < themes.size(); i++) {
        Theme currentTheme = themes.get(i);
        if (currentTheme.getId() == theme.getId()) {
            themes.set(i, theme);
            break;
        }
    }

}

// Μέθοδος για να εμφανίσεις όλα τα themes
    public void displayThemes() {
        for (Theme theme : themes) {
            System.out.println(theme);
        }

    }}
