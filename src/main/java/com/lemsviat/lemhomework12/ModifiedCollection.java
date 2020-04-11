package main.java.com.lemsviat.lemhomework12;

import java.util.ArrayList;

public class ModifiedCollection extends ArrayList<Integer> {
    @Override
    public boolean add(Integer newElement) {
        if (newElement != null) {
            for (int i = 0; i < size(); i++) {
                set(i, get(i) + newElement);
            }
            return super.add(newElement);
        } else System.out.println("Ввод Null в коллекцию недопустим");
        return false;
    }
    @Override
    public Integer remove(int index) {
        int deletedElement=get(index);
        for (int i = 0; i < size(); i++) {
            set(i, get(i) - deletedElement);
        }
        return super.remove(index);
    }
    public double getAverage() {
        double sum = 0;
        double avg;
        for (Integer integer : this) {
            sum += integer;
        }
        avg = sum / size();
        return avg;
    }
    public int getMaxValue() {
        int max = 0;
        for (Integer integer : this) {
            if (integer > max)
                max = integer;
        }
        return max;
    }
    public int getMinValue() {
        int min = get(0);
        for (Integer integer : this) {
            if (integer < min)
                min = integer;
        }
        return min;
    }

    public static void main(String[] args) {
        ModifiedCollection modifiedCollection = new ModifiedCollection();
        modifiedCollection.add(null);
        //modifiedCollection.add("a"); //ввод чего угодно, кроме целого числа выдаст ошибку
        for (int i=0; i<10; i++) {
            modifiedCollection.add((int) (Math.random()*5));
        }

        System.out.println("Начальная коллекция: "+ modifiedCollection);
        modifiedCollection.remove(2);
        System.out.println("Коллекция после удаления элемента: " + modifiedCollection);
        System.out.println("Среднее значение: "+ modifiedCollection.getAverage());
        System.out.println("Максимальное значение: "+ modifiedCollection.getMaxValue());
        System.out.println("Минимальное значение: "+ modifiedCollection.getMinValue());
    }
}
