package P9;

public class StackSurat16 {
    Surat16[] stack;
    int top;
    int size;
      StackSurat16(int size) {
        this.size = size;
        stack = new Surat16[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Surat16 s) {
        if (!isFull()) {
            stack[++top] = s;
        }
    }

    Surat16 pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return null;
    }

    Surat16 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    boolean cari(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
}
}