package com.vlkn.builderPattern;

public class Watch {

    //required fields

    private final String name;
    private final String model;
    private final double price;

    //optional fields
    private final String subModel;
    private final int garantyInYears;
    private final String color;
    private final boolean isSapphireGlass;

    private Watch(Builder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.price = builder.price;
        this.subModel = builder.subModel;
        this.garantyInYears = builder.garantyInYears;
        this.color = builder.color;
        this.isSapphireGlass = builder.isSapphireGlass;
    }

    public static class Builder{

        //required fields

        private final String name;
        private final String model;
        private final double price;

        //optional fields
        private String subModel;
        private int garantyInYears;
        private String color;
        private boolean isSapphireGlass;

        public Builder(String name,String model,int price) {
            this.name = name;
            this.model = model;
            this.price=price;
        }
        public Builder subModel(String val) {
            this.subModel = val;
            return this;
        }
        public Builder garantyInYears(int val) {
            this.garantyInYears = val;
            return this;
        }
        public Builder color(String val) {
            this.color = val;
            return this;
        }
        public Builder isSapphire(boolean val) {
            this.isSapphireGlass = val;
            return this;
        }

        public Watch build() {
            return new Watch(this);
        }
    }
}
