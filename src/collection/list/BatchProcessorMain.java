package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        BatchProcessor batchProcessor = new BatchProcessor(arrayList);
        batchProcessor.logic(50_000);

        MyLinkedList linkedList = new MyLinkedList<Integer>();
        BatchProcessor batchProcessor1 = new BatchProcessor(linkedList);
        batchProcessor1.logic(50_000);
    }
}
