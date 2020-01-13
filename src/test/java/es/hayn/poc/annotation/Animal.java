package es.hayn.poc.annotation;

class Animal {

    @NeverNull
    String id;
    @NeverNull
    String name;
    @NeverNull
    String other;

    Animal(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Animal(String id, String name, String other) {
        this(id, name);
        this.other = other;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOther() {
        return other;
    }
}
