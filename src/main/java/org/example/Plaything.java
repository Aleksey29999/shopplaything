package org.example;

public static class Plaything {
    protected Integer id_plaything;
    protected String name;
    protected Integer count;
    protected  double weight;

    public Plaything(Integer id_plaything, String name, Integer count, double weight) {
        this.id_plaything = id_plaything;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "org.example.Main.Plays{" +
                "id_plaything=" + id_plaything +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                '}';
    }

    public Integer getId_plays() {
        return id_plaything;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public double getWeight() {
        return weight;
    }

    public void setId_plays(Integer id_plays) {
        this.id_plaything = id_plaything;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}