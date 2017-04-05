// Класс, реализующий стек для хранения символов
class Stack {
    private char stck[]; // массив для хранения элементов стека
    private int tos;     // вершина стека

    // Создать пустой стек заданного размера
    Stack(int size) {
        stck = new char[size]; // выделить память для стека
        tos = 0;
    }

    // Создать один стек из другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        // скопировать элементы
        for(int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Создать стек с начальными значениями
    Stack(char a[]) {
        stck = new char[a.length];

        for(int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    // Поместить символы в стек
    void push(char ch) {
        if(tos == stck.length) {
            System.out.println(" -- Стек заполнен");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    // Извлечь символы из стека
    char pop() {
        if(tos == 0) {
            System.out.println(" -- Стек пуст");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }
}

// Демонстрация использования класса Stack
class StDemo {
    public static void main(String args[]) {
        // создать пустой стек на 10 элементов
        Stack stck1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};

        // создать стек из массива
        Stack stk2 = new Stack(name);

        char ch;
        int i;

        // поместить символыв стек stk1
        for(i = 0; i < 10; i++)
            stck1.push((char) ('A' + i));

        // создать один стек из другого стека
        Stack stk3 = new Stack(stck1);

        // отобразить стеки
        System.out.print("Содержимое stk1: ");
        for(i = 0; i < 10; i++) {
            ch = stck1.pop();
            System.out.print(ch);
        }

        System.out.println();

        System.out.print("Содержимое stk2: ");
        for(i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println();

        System.out.print("Содержимое stk3: ");
        for(i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }

        System.out.println();
    }
}