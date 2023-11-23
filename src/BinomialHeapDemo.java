public class BinomialHeapDemo {
    public static void main(String[] args) throws Exception {

        int[] A = {5,25,50,75,80,90,95,21};
        int[] B = {3,6,70,85,88,98,32,41};

        BinomialHeap heapA = new BinomialHeap();
        for (int i : A) {
            heapA.insert(i);
        }
        System.out.println("Binomial Heap A");
        heapA.print();

        BinomialHeap heapB = new BinomialHeap();
        for (int j : B) {
            heapB.insert(j);
        }
        System.out.println("Binomial Heap B");
        heapB.print();

        heapA = heapA.union(heapB);

        int minA = heapA.extractMin();
        System.out.println("Extracting the minimum element from heapA : ");
        System.out.println(minA);
        System.out.println(" ");
        heapA.print();

        BinomialHeapDS search = heapA.find(95, heapA.head);
        System.out.println("Decreasing key in heapA, Setting new key as 12");
        heapA.decreaseKey(search, 12);
        heapA.print();

        System.out.println("Deleting 21 From HeapA");
        BinomialHeapDS n21 = heapA.find(21, heapA.head);
        heapA.delete(n21);
        heapA.print();

        System.out.println("The minimum element in heapA is:");
        System.out.println(heapA.minimum());

    }

}