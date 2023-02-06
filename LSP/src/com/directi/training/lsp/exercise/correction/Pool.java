package com.directi.training.lsp.exercise.correction;

public class Pool
{
    public void run(Duck... ducks)
    {
        quack(ducks);
        swim(ducks);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        Duck donaldDuck = new Duck();
        Duck electricDuck = new ElectronicDuck();
        pool.run(donaldDuck, electricDuck);
    }
}

