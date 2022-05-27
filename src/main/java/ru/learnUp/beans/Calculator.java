package ru.learnUp.beans;

public class Calculator {
    private DivideProcessor divideProcessor;
    private SumProcessor sumProcessor;
    private SubtractProcessor subtractProcessor;
    private MultiplyProcessor multiplyProcessor;

    public Calculator(DivideProcessor divideProcessor, SumProcessor sumProcessor, SubtractProcessor subtractProcessor, MultiplyProcessor multiplyProcessor) {
        this.divideProcessor = divideProcessor;
        this.sumProcessor = sumProcessor;
        this.subtractProcessor = subtractProcessor;
        this.multiplyProcessor = multiplyProcessor;
    }

    public int sum(int arg1, int arg2) {
        return sumProcessor.process(arg1, arg2);
    }

    public int subtract(int arg1, int arg2) {
        return subtractProcessor.process(arg1, arg2);
    }

    public int divide(int arg1, int arg2) {
        return divideProcessor.process(arg1, arg2);
    }

    public int multiply(int arg1, int arg2) {
        return multiplyProcessor.process(arg1, arg2);
    }
}
