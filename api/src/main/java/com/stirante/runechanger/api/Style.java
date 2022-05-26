package com.stirante.runechanger.api;

public enum Style {
    //Generated on Thursday, May 26, 2022 at 10:16:49 PM Central European Summer Time
    STYLE_8000(8000, "Precision"),
    STYLE_8100(8100, "Domination"),
    STYLE_8200(8200, "Sorcery"),
    STYLE_8300(8300, "Inspiration"),
    STYLE_8400(8400, "Resolve");

    private final int id;
    private final String name;

    Style(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets style by name
     *
     * @param name style name
     * @return style
     */
    public static Style getByName(String name) {
        for (Style style : values()) {
            if (style.name.equalsIgnoreCase(name)) {
                return style;
            }
        }
        return null;
    }

    /**
     * Gets style by id
     *
     * @param id style id
     * @return style
     */
    public static Style getById(int id) {
        for (Style style : values()) {
            if (style.id == id) {
                return style;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name() + "(" + name + ")";
    }
}
